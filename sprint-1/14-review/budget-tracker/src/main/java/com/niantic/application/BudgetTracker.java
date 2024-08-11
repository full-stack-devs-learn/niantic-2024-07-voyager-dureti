package com.niantic.application;

import com.niantic.models.Category;
import com.niantic.models.Transaction;
import com.niantic.services.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class BudgetTracker
{
    Scanner userInput = new Scanner(System.in);

    CategoryDao categoryDao = new CategoryDao();
    SubCategoryDao subCategoryDao = new SubCategoryDao();
    TransactionDao transactionDao = new TransactionDao();
    UserDao userDao = new UserDao();
    VendorDao vendorDao = new VendorDao();


    public void run()
    {

        while(true)
        {
            int choice = homeScreenSelection();
            switch(choice)
            {
                case 1:
                    System.out.println("add transaction");
                    break;
                case 2:
                    System.out.println("reports");
                    break;
                case 3:
                    System.out.println("add user");
                    break;
                case 4:
                    System.out.println("add category");
                    break;
                case 5:
                    System.out.println("add sub category");
                    break;
                case 6:
                    System.out.println("add vendor");
                    break;
                case 0:
                    System.out.println();
                    System.out.println("Thank you for using Northwind!");
                    System.out.println("Goodbye");
                    System.out.println();
                    System.exit(0);
                default:
                    System.out.println("invalid selection");
                    break;
            }
        }

    }

    private int homeScreenSelection()
    {
        System.out.println();
        System.out.println("Budget Tracker");
        System.out.println("--------------------------------------");
        System.out.println("Select from the following options:");
        System.out.println();
        System.out.println("  1) Add Transaction");
        System.out.println("  2) Reports");
        System.out.println("  3) Add User");
        System.out.println("  4) Add Category");
        System.out.println("  5) Add Sub Category");
        System.out.println("  6) Add Vendor");
        System.out.println("  0) Quit");
        System.out.println();

        System.out.print("Enter an option: ");
        return Integer.parseInt(userInput.nextLine());
    }

    private int reportSelection ()
    {
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Report");
        System.out.println("--------------------------------------");
        System.out.println("Select from the following options:");
        System.out.println();
        System.out.println("  1) Transactions By User");
        System.out.println("  2) Transactions By Month");
        System.out.println("  3) Transactions By Year");
        System.out.println("  4) Transactions By Sub Category");
        System.out.println("  5) Transaction By Category");
        System.out.println("  0) Back");
        System.out.println();

        return getUserInt("Enter your selection: ");
    }

    private void addTransaction()
    {
        System.out.println();
        System.out.println("Add Transaction");
        System.out.println("-".repeat(100));

        BigDecimal amount = getInputDecimal(" Enter the amount: ");
        String notes = getUserString(" Enter notes: ");
        String transactionDate = getUserString(" Enter Date in (YYYY-MM-DD) format: ");
        String vendor = getUserString("Enter Vendor: ");
        String subCategory = getUserString("Enter Sub Category: ");
        System.out.println();

        var transaction = new Transaction()
        {{
            setAmount(amount);
            setNotes(notes);
            setTransactionDate(LocalDate.parse(transactionDate));

        }};

    }



    // helper functions

    private void waitForUser()
    {
        System.out.println();
        System.out.println("Press ENTER to continue...");
        userInput.nextLine();
    }

    private String getUserString(String message)
    {
        System.out.print(message);
        return userInput.nextLine();
    }

    private int getUserInt(String message)
    {
        return Integer.parseInt(getUserString(message));
    }

    private double getUserDouble(String message)
    {
        return Double.parseDouble(getUserString(message));
    }

    private BigDecimal getInputDecimal(String input) {
        return new BigDecimal(input);
    }


}
