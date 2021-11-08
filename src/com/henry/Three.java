package com.henry;

public class Three {
    public static void main(String[] args) {
        for(int i = 0; i < 35; i++) {
            /*
            For loop runs 35 times, with the variable 'i' starting at 0.
            Each time it loops i = i + 1

      TODO: This means this script calculates the answer with brute force.
             */
            if((31 - i) + (34 - i) == 27) {
                /*
                As soon as this statement is true, Daisy's total goals are the value 'i'.
                 */
                System.out.println("Daisy: " + i);
                System.out.println("Mary: " + (34 - i));
                System.out.println("Terry: " + (31 - i));
                break; // Stops the loop, so it doesn't continue uselessly.
            }
        }
    }
}
