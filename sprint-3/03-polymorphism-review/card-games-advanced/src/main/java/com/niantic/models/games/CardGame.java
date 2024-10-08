package com.niantic.models.games;

import com.niantic.models.players.Player;
import com.niantic.models.cards.Card;
import com.niantic.models.cards.Dealer;
import com.niantic.models.cards.Deck;

import java.util.LinkedList;
import java.util.Queue;

public abstract class CardGame
{
    protected Dealer dealer;
    protected Deck deck;
    protected Queue<Player> players;
    protected Player winner = new Player("");

    public CardGame(Deck deck)
    {
        this.deck = deck;
        this.dealer = new Dealer(deck);

        players = new LinkedList<>();
    }

    public Queue<Player> getPlayers()
    {
        return players;
    }

    public Player getNextPlayer()
    {
        Player player = players.remove();
        players.offer(player);

        return player;
    }

    public Player getWinner()
    {
        return winner;
    }

    public abstract void dealPlayersIn();

    public void join(Player player)
    {
        players.offer(player);
    }

    public void deal(Player player)
    {
        Card card = dealer.deal();
        player.deal(card);
    }

    public abstract void endGame();
}
