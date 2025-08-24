
//package com.javarush.task.task01.task0107;

/*
Uncomment one line so that the program displays the numbers 12 and 2 on the screen (first 12, then 2).

Requirements:
• The program must display the numbers 12 and 2 on the screen.
• You cannot change the lines with variable declarations.
• The program must contain only two variables of type int.
• You cannot change the lines responsible for output to the console.
• You need to uncomment one line and leave the rest unchanged.
*/

public class q7 {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        // y = x * y;
         y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}