package com.niantic.application;

import com.niantic.models.Board;
import com.niantic.models.Card;
import com.niantic.models.Deck;
import com.niantic.models.Player;
import com.niantic.ui.UserInterface;

import java.util.ArrayList;
import java.util.List;

public class CardGameApplication {
    private final Deck deck = new Deck();
    private final Board board;
    private final List<Player> players = new ArrayList<>();
    private final UserInterface ui = new UserInterface();

    public CardGameApplication(Board board) {
        this.board = board;
    }

    public CardGameApplication() {
        board = new Board(4, 4, deck.getCards()); // 4x4 board
        addPlayers();
    }

    private void addPlayers() {
        players.add(new Player("Player One"));
        players.add(new Player("Player Two"));
    }

    private Card getValidCard(Player player) {
        Card card;
        do {
            int[] move = ui.getPlayerMove(player);
            card = board.getCard(move[0], move[1]);
            if (card == null) {
                ui.displayMessage("Invalid move. Please try again.");
            }
        } while (card == null);
        return card;
    }

    public void run() {
        while (!board.allCardsMatched()) {
            for (Player player : players) {
                ui.displayBoard(board);

                // Get the first valid card
                // bug issue due to null exception....solved using this
                Card firstCard = getValidCard(player);
                firstCard.flip();
                ui.displayBoard(board);

                // Get the second valid card,to check it's not the same as the first
                // bug issue due to null exception....solved using this
                Card secondCard;
                do {
                    secondCard = getValidCard(player);
                    if (firstCard == secondCard) {
                        ui.displayMessage("You cannot pick the same card twice. Please select a different card.");
                        secondCard = null;
                    }
                } while (secondCard == null);

                secondCard.flip();
                ui.displayBoard(board);

                if (firstCard.getValue().equals(secondCard.getValue())) {
                    ui.displayMessage("Match found!");
                    player.incrementScore();
                } else {
                    ui.displayMessage("No match. Cards will be flipped back.");
                    firstCard.flip();
                    secondCard.flip();
                }

                ui.displayPlayerScore(player);
            }
        }
        declareWinner();
    }

    private void declareWinner() {
        Player winner = players.get(0);
        for (Player player : players) {
            if (player.getScore() > winner.getScore()) {
                winner = player;
            }
        }
        ui.displayWinner(winner);
    }
}
