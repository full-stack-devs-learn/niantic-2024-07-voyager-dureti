package com.niantic.models;

public class Card
{
    private final String value;
    private boolean faceUp;

    public Card(String value) {
        this.value = value;
        this.faceUp = false;
    }

    public String getValue() {
        return value;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public void flip() {
        faceUp = !faceUp; // Flips the card
    }

    @Override
    public String toString() {
        return faceUp ? value : "X"; // Display the value if face up, or "X" if face down
    }
}