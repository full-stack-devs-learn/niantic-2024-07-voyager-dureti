package com.niantic.models;

import java.util.HashMap;
import java.util.List;

public class Board {
    private final HashMap<String, Card> grid = new HashMap<>();
    private final int rows;
    private final int columns;

    public Board(int rows, int columns, List<Card> cards) {
        this.rows = rows;
        this.columns = columns;
        initializeGrid(cards);
    }

    private void initializeGrid(List<Card> cards) {
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                String position = i + "," + j;
                grid.put(position, cards.get(index++));
            }
        }
    }

    public Card getCard(int row, int column) {
        String position = row + "," + column;
        return grid.get(position);
    }

    public boolean allCardsMatched() {
        for (Card card : grid.values()) {
            if (!card.isFaceUp()) {
                return false;
            }
        }
        return true;
    }

    public void displayBoard() {
        System.out.println("Board:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                String position = i + "," + j;
                System.out.print(grid.get(position) + " ");
            }
            System.out.println();
        }
    }
}