package com.javarush.task.pro.task02.task0203;

/*
The number variable contains a number.
The last digit of this number must be written to the lastDigit variable.
Use the number variable and the remainder operator to calculate it.
Use one command to declare and initialize lastDigit.

Hint: divide by 10.

Requirements:
• Do not change the value of the number variable.
• Number and the remainder operator must be used to calculate lastDigit.
• The program must display the value of the lastDigit variable.
*/

public class Solution {

    public static void main(String[] args) {
        int number = 546;

        int lastDigit = number % 10; //напишите тут ваш код

        System.out.println(lastDigit);
    }
}