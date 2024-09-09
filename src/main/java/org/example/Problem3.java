package org.example;

import java.math.BigInteger;

public class Problem3 {
    public static void main(String[] args) {

        long largestnumber = 0;

        long number = 600851475143L;

        for( long i = 1; i <= number ; i++){
            if(number % i == 0){
                largestnumber = i;
            }
        }
        System.out.println(largestnumber);


    }
}
