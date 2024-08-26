package com.niantic.models;

public class Player
{
    private final String name;
    private final Hand hand = new Hand();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public void drawCard(Deck deck) {
        Card drawnCard = deck.drawCard();
        if (drawnCard != null) {
            hand.addCard(drawnCard);
        }
    }

    public void playCard(Card card) {
        hand.removeCard(card);
    }
}