package com.henry.maths;

public class Four {
    public static void main(String[] args) {
        Integer day = 0;
        Boolean answered = false;
        do {
            day++;
        } while(!(day % 7 == 0 && day % 6 == 0 && day % 5 == 0 && day % 4 == 0 && day % 3 == 0 && day % 2 == 0));

        System.out.println(day);
    }
}
