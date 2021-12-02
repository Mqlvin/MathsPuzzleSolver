package com.henry.maths;

public class Two {
    public static void main(String[] args) {
        for(int i = 1; i < 100; i++) {
            /*
            The 'for' loop repeats 99 times, starting at 1.
            The value 'i' represents the amount of times it has repeated.
             */
            if(i % 8 == 3 && i % 9 == 4) {
                /*
                The % operator returns the division remainder.
                For example, 17 % 8 would be equal to 1.
                 */
                System.out.println("Result: " + i);
            }
        }
    }
}