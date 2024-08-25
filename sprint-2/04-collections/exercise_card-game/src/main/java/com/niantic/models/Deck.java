package com.niantic.models;

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
    private ArrayList<Card> cards;

    public Deck()
    {
        // build the deck of cards
        cards = new ArrayList<>();

        int[] numbers = {1, 2, 3, 4, 5};
        String[] colors = {"Red", "Blue", "Green", "Yellow"};

        for (String color : colors) {
            for (int number : numbers) {
                cards.add(new Card(color, number));
                cards.add(new Card(color, number)); // Add a pair
            }
        }

        shuffle();
    }

    public Card takeCard() {
        return cards.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int getRemainingCards() {
        return cards.size();
    }
}
