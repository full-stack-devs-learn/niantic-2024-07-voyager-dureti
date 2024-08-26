package com.niantic.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck
{
    private final ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8"};
        for (String value : values) {
            // Add two cards of each value to make pairs
            cards.add(new Card(value));
            cards.add(new Card(value));
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return cards;
    }
}
