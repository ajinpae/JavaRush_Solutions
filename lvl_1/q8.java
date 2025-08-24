
//package com.javarush.task.task01.task0108;

/*
Comment out unnecessary lines of code so that the following message appears on the screen:
2 plus 3 equals 5
Note: you cannot comment out lines declaring variables int a and int b.

Requirements:
• The program must display the message "2 plus 3 equals 5" on the screen
• You cannot change lines declaring variables int a and int b.
• You must comment out at least one line.
• You cannot change (you can comment out) or add commands responsible for output
*/

public class q8 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

       // System.out.print("два");
        System.out.print(b);
        System.out.print(" плюс ");
    //    System.out.print(" минус ");
        System.out.print(a);
     //   System.out.print("три");
        System.out.print(" равно ");
 //       System.out.print(" будет ");
     //   System.out.print("пять");
        System.out.print(a + b);
    }
}