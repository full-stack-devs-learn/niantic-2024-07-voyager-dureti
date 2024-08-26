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
}