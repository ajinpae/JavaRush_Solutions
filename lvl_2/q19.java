package lvl_2;
/* 
The main method displays the values ​​of three strings.
Change the code so that the length of each string is displayed instead of the string values.

Requirements:
• Do not change the value of the emptyString variable.
• The length method must be called for the three strings passed to the println method.
• The program must display three numbers, each on a new line.
*/

public class q19 {
    public class Solution {

    public static void main(String[] args) {
        String emptyString = "";

        //напишите тут ваш код
        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());
    }
}
    
}
