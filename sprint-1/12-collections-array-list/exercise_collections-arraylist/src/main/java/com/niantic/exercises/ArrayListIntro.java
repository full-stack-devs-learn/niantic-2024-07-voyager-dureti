package com.niantic.exercises;

import java.util.ArrayList;

public class ArrayListIntro
{
    /*
    1. Create an ArrayList of Strings and add the names of your
       5 favorite heroes.

    Return the list.
     */
    public ArrayList<String> getHeroesList()
    {

        ArrayList<String> heroes = new ArrayList<String>();
        heroes.add("Superman");
        heroes.add("Batman");
        heroes.add("Black Panther");
        heroes.add("Spider-Man");
        heroes.add("Iron Man");

        return heroes;
    }

    /*
    2. Given a list of integers, create and return a new list of just the
       even numbers in the list

       findEvens( [1, 2, 3, 4] )            ->  [2, 4]
       findEvens( [21, 98, 78, 5, 6, 8] )   ->  [98, 78, 6, 8]
     */
    public ArrayList<Integer> findEvens(ArrayList<Integer> numbers)
    {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (Integer number : numbers) {
        if (number % 2 == 0) {
            evenNumbers.add(number);
        }
    }
        return evenNumbers;
    }


    /*
    3. Given a list of integers, return the sum of all numbers

       sum( [1, 2, 3, 4] )            ->  10
       sum( [21, 98, 78, 5, 6, 8] )   ->  216
     */
    public int sum(ArrayList<Integer> numbers)
    {
        int sumOfAllNumbers = 0;
        for (Integer number : numbers) {
            sumOfAllNumbers += number;
        }
        return sumOfAllNumbers;
    }

    /*
    4. Given a list of integers, return the highest number

       sum( [1, 2, 3, 4] )            ->  4
       sum( [21, 98, 78, 5, 6, 8] )   ->  98
     */
    public int max(ArrayList<Integer> numbers)
    {
        int maxNumber = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;

    }

    /*
    5. Given a list of integers, return the lowest number

       sum( [1, 2, 3, 4] )            ->  1
       sum( [21, 98, -78, 5, 6, 8] )  ->  -78
     */
    public int min(ArrayList<Integer> numbers)
    {
        int minNumber = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        return minNumber;
    }

    /*
    6. Given a list of integers, return the average of all numbers
       This should return the average as an integer, not a floating point

       sum( [3, 1, 59, -4, 81, 23] )    ->  27
       sum( [21, 98, -78, 5, 6, 8] )    ->  53
     */
    public int average(ArrayList<Integer> numbers)
    {
        int sumOfAllNumbers = 0;
        for (Integer number : numbers) {
            sumOfAllNumbers += number;
        }
        int averageOfAllNumbers = sumOfAllNumbers / numbers.size();
        return averageOfAllNumbers;
    }

    /*
    7.  Build an arrayList that holds the fibonacci sequence

        The fibonacci sequence is a numeric pattern 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
        - each new number is added by calculating the sum of the previous 2 numbers
          0 + 1 = 1
          1 + 1 = 2
          1 + 2 = 3
          2 + 3 = 5
          etc.
        - the sequence must begin with 0, 1 so size will never be lower than 2

        Include as many numbers as is specified by the size input
     */
    public ArrayList<Integer> buildFibonacci(int size)
    {
        ArrayList<Integer> fibonacciList = new ArrayList<Integer>();

        // for empty list
        if (size <= 0) {
            return fibonacciList;
        }
        // first fib number
        fibonacciList.add(0);
        if (size == 1) {
            return fibonacciList;
        }
        // second fib number
        fibonacciList.add(1);
        for (int i = 2; i < size; i++) {
            int nextFibonacciNumber = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
            fibonacciList.add(nextFibonacciNumber);
        }
        return fibonacciList;
    }

}
