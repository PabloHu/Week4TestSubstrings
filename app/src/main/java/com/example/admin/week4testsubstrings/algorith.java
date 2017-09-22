package com.example.admin.week4testsubstrings;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Admin on 9/22/2017.
 */

public class algorith {

    public static void main(String[] args) {
/*
        1. . Say you have a string of characters. Write an algorithm to collect and return a list of all substrings such that order is maintained but characters may be skipped. So “frog” can produce fog, fg, rg, etc.

        2. Sort the array with multiple same values in the array in an ascending order.
        Input: {2,8,9,3,4,3,2,6,6,2,4,9,8}
        Output: {2,2,2,3,3,4,4,6,6,8,8,9,9}
        -Also find the highest number in the array (do not use any collections method)


        */
    //    System.out.println("hello");

        one("Sanfransisco");
        int[]toSort = {2,8,9,3,4,3,2,6,6,2,4,9,8};
        two(toSort);
        third(toSort);
    }

    private static void third(int[] toSort) {
int hightest=0;
        for (int i = 0; i < toSort.length; i++) {
            if(hightest < toSort[i])
                hightest = toSort[i];
        }
    System.out.println("\n Highest: "+ hightest);
    }


    private static void two(int[] toSort) {
        System.out.println("\n====================================");
        for (int i = 0; i < toSort.length; i++) {
            System.out.print(toSort[i]);
            for (int j = 0; j < toSort.length ; j++) {
                if(toSort[i]<toSort[j])
                {
                    int changingNum = toSort[i];
                    toSort[i] = toSort[j];
                    toSort[j] = changingNum;
                }
            }
        }
        System.out.println("\n====================================");
        for (int i = 0; i <toSort.length ; i++) {
            System.out.print(toSort[i]);
        }
    }

    private static void one(String person) {
int[]a=null;

        int position;
            Random random = new Random();
            int maxNumbersOfChars = random.nextInt(person.length()-1)+2;
      /*  System.out.println("------");
        System.out.println(maxNumbersToTakeOut+"");
        System.out.println("------");
        */
        System.out.println("------");
        System.out.println(person.length());
        System.out.println(maxNumbersOfChars+"");
        System.out.println("------");
        a = new int[maxNumbersOfChars];
            for (int i = 0; i < maxNumbersOfChars; i++) {
                Random random1 = new Random();
                 position = random.nextInt(person.length()-1);

                for (int j = 0; j <i ; j++) {

                    while(position == a[j]){
                        random1 = new Random();
                        position = random1.nextInt(person.length()-1);
                    }
                                            System.out.println("****");
                        System.out.println(position);
                        System.out.println("***");
                        a[i] = position;

                }


               // System.out.println(person.charAt(position));
            }


        Arrays.sort(a);

        System.out.println("max num to use: " +maxNumbersOfChars);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);

        }
        System.out.print("\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(person.charAt(a[i]));

        }
            //System.out.println(n+"");


    }
}
