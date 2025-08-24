package lvl_2;
//package com.javarush.task.pro.task02.task0202;

/*
The variable centimeters contains the number of centimeters.
The variable meters must contain the number of full meters in centimeters (1 meter = 100 cm).
Use the variable centimeters and the division operator to calculate.
Use one command to declare and initialize meters.

Requirements:
• Do not change the value of the variable centimeters.
• Centimeters and the division operator must be used to calculate meters.
• The program must display the value of the variable meters.
*/

public class q10 {

    public static void main(String[] args) {
        int centimeters = 243;

        int meters = centimeters / 100; //напишите тут ваш код

        System.out.println(meters);
    }
}