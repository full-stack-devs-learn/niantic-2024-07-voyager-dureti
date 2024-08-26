package com.niantic.ui;

import com.niantic.models.Board;
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

    public void displayBoard(Board board) {
        displaySeparator();
        board.displayBoard();
        displaySeparator();
    }

    public int[] getPlayerMove(Player player) {
        displayMessage(player.getName() + ", enter the row and column of the card to flip (e.g., '0 1' for row 0, column 1):");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new int[]{row, col};
    }

    public void displayPlayerScore(Player player) {
        displayMessage(player.getName() + "'s score: " + player.getScore());
    }

    public void displayWinner(Player player) {
        displaySeparator();
        displayMessage("Congratulations " + player.getName() + ", you win!");
        displaySeparator();
    }
}