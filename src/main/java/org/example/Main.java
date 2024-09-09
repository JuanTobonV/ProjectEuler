package org.example;

import java.math.BigInteger;


public class Main {
    public static void main(String[] args) {
        //PROJECT EULER


        int sumatory = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                sumatory = sumatory + i;
            }
        }
        System.out.println("The sum of all the multiples of 3 or 5 below 10 are: " + sumatory);

    }
}