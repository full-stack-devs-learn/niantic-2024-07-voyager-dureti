package com.niantic.models;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DeckTest
{
    @Test
    public void Deck_getCard_shouldInitializeDeck() {
        // Arrange & Act
        Deck deck = new Deck();
        List<Card> cards = deck.getCards();

        // Assert
        assertEquals(16, cards.size(), "Because deck should have 16 cards (8 pairs).");
    }

    @Test
    public void shuffle_shouldShuffleCardIn_differentPosition() {
        // Arrange
        Deck deck = new Deck();
        List<Card> cardsBeforeShuffle = List.copyOf(deck.getCards());

        // Act
        deck.shuffle();
        List<Card> cardsAfterShuffle = deck.getCards();

        // Assert
        assertNotEquals(cardsBeforeShuffle, cardsAfterShuffle, "Because cards should be shuffled into a different order.");
    }
}
