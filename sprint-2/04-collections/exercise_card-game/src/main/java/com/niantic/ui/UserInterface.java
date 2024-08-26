package com.niantic.ui;

import com.niantic.models.Card;
import com.niantic.models.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface
{
    private final Scanner scanner = new Scanner(System.in);

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displaySeparator() {
        System.out.println("========================================");
    }

    public void displayWelcomeMessage() {
        displaySeparator();
        System.out.println("  Welcome to the Crazy Eights Card Game!");
        displaySeparator();
    }

    public void displayHand(Player player) {
        displaySeparator();
        System.out.println(player.getName() + "'s Hand:");
        System.out.println(player.getHand());
        displaySeparator();
    }

    public String getPlayerChoice(Player player) {
        displayMessage(player.getName() + ", it's your turn.");
        displayMessage("Choose a card to play (e.g., '2 of Hearts') or type 'draw' to draw a card:");
        return scanner.nextLine();
    }

    public void displayInvalidChoice() {
        displayMessage("Invalid choice. Please try again.");
    }

    public void displayWinner(Player player) {
        displaySeparator();
        System.out.println("Congratulations " + player.getName() + ", you win!");
        displaySeparator();
    }
}
