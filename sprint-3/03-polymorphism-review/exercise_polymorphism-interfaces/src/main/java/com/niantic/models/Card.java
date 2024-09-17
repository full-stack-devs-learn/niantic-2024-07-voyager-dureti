package com.niantic.models;

import java.util.HashMap;
import java.util.Map;

public class Card implements Comparable<Card>
{
    private String suit;
    private String faceValue;

    public Card(String suit, String faceValue)
    {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String getSuit()
    {
        return suit;
    }

    public String getFaceValue()
    {
        return faceValue;
    }

    public int getPointValue()
    {
        return cardValues.get(faceValue);
    }

    public String getColor()
    {
        switch (suit.toLowerCase())
        {
            case "hearts":
            case "diamonds":
                return "Red";
            default:
                return "Black";
        }
    }

    // lookup map
    private static final Map<String, Integer> cardValues = new HashMap<>()
    {{
        put("A", 11);
        put("K", 10);
        put("Q", 10);
        put("J", 10);
        put("10", 10);
        put("9", 9);
        put("8", 8);
        put("7", 7);
        put("6", 6);
        put("5", 5);
        put("4", 4);
        put("3", 3);
        put("2", 2);
    }};

    private static final Map<String, Integer> suitPriority = new HashMap<>() {{
        put("spades", 1);
        put("hearts", 2);
        put("diamonds", 3);
        put("clubs", 4);
    }};

    private static final Map<String, Integer> faceValuePriority = new HashMap<>() {{
        put("A", 14);
        put("K", 13);
        put("Q", 12);
        put("J", 11);
        put("10", 10);
        put("9", 9);
        put("8", 8);
        put("7", 7);
        put("6", 6);
        put("5", 5);
        put("4", 4);
        put("3", 3);
        put("2", 2);
    }};

    @Override
    public int compareTo(Card o) {

        int compareSuit = Integer.compare(
                suitPriority.get(this.suit.toLowerCase()),
                suitPriority.get(o.getSuit().toLowerCase())
        );

        if (compareSuit != 0) {
            return compareSuit;
        }

        return Integer.compare(
                faceValuePriority.get(this.faceValue),
                faceValuePriority.get(o.getFaceValue())
        );
    }

}
