package com.niantic.models;

public class Card
{
    private String color;
    private int number;
    private boolean isFaceUp;

    public Card(String color, int number)
    {
        this.color = color;
        this.number = number;
        this.isFaceUp = false;
    }

    public String getColor()
    {
        return color;
    }

    public int getValue()
    {
        return number;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }
    @Override
    public String toString() {
        return color + " " + number;
    }
}
