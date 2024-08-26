package com.niantic.models;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest
{
    @Test
    public void checkIfBoardIs_Initialized() {
        // Arrange
        Deck deck = new Deck();
        List<Card> cards = deck.getCards();

        // Act
        Board board = new Board(4, 4, cards);

        // Assert
        assertNotNull(board.getCard(0, 0), "Because board should have a card at position (0,0).");
        assertNotNull(board.getCard(3, 3), "Because board should have a card at position (3,3).");
        assertNull(board.getCard(4, 4), "Because board should return null for out-of-bounds positions.");
    }

    @Test
    public void allCardsMatched_shouldCheckIfTheCardIs_matchedWhenFaceUp() {
        // Arrange
        Deck deck = new Deck();
        List<Card> cards = deck.getCards();
        Board board = new Board(4, 4, cards);

        // Act
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board.getCard(i, j).flip();
            }
        }

        // Assert
        assertTrue(board.allCardsMatched(), "Because all cards should be considered matched when flipped face up.");
    }

    @Test
    public void displayBoard_shouldPrintTheBoardCurrentStateAnd_throwException() {
        // Arrange
        Deck deck = new Deck();
        List<Card> cards = deck.getCards();
        Board board = new Board(4, 4, cards);

        // Act & Assert
        assertDoesNotThrow(board::displayBoard, "Because display board should not throw any exceptions.");
    }
}
