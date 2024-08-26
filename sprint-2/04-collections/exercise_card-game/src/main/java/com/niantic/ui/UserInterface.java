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
}