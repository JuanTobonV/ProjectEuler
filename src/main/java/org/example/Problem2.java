package org.example;

public class Problem2 {
    public static void main(String[] args) {
        long a1 = 0;
        long an = 1;
        long sum = 0;

        for(long i = 1; an <= 4000000; i++){
            an = an + a1;
            a1 = an - a1;

            if(an % 2 == 0){
                sum += an;
            }

        }
        System.out.println(sum);
    }
}
