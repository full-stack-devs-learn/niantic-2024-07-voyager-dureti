package com.niantic.models;

import java.util.ArrayList;

public class Hand
{
    private final ArrayList<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int size() {
        return cards.size();
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}
