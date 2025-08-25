package lvl_2;
/* 
The main method prints three lines to the screen.
Change the code so that all the letters in these lines become capital letters.

Requirements:
• Do not change the values ​​of the caps and usa variables.
• Call the toUpperCase method on the three lines passed to the println method.
• The program output should contain three lines.
*/
public class q21 {
    public static void main(String[] args) {
        String caps = "if I type in caps ";
        String usa = "сша";

        //напишите тут ваш код
        System.out.println(usa.toUpperCase());
        System.out.println("Винни Пух".toUpperCase());
        System.out.println(caps.toUpperCase() + "they know I mean business".toUpperCase());
    }
}    
}
