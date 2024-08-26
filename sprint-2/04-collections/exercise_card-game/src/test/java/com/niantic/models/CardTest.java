package com.niantic.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest
{
    @Test
    public void getValue_shouldCreateCard_AndIsFaceUp_shouldTestIfCardIs_FaceUp() {
        // Arrange & Act
        Card card = new Card("A");

        // Assert
        assertEquals("A", card.getValue(), "Because card value should be initialized to 'A'.");
        assertFalse(card.isFaceUp(), "Because card should be face down at the start.");
    }

    @Test
    public void flip_shouldFlipUpOrDown_theCard() {
        // Arrange
        Card card = new Card("A");

        // Act
        card.flip();

        // Assert
        assertTrue(card.isFaceUp(), "Because card should be face up after flip.");

        // Act
        card.flip();

        // Assert
        assertFalse(card.isFaceUp(), "Because card should be face down after second flip.");
    }

    @Test
    public void toString_shouldDisplay_X_Or_Value_whenFceUpOr_Down() {
        // Arrange
        Card card = new Card("A");

        // Act & Assert
        assertEquals("X", card.toString(), "Because card should display 'X' when face down.");

        // Act
        card.flip();

        // Assert
        assertEquals("A", card.toString(), "Because card should display its value 'A' when face up.");
    }
}