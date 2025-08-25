package lvl_2;

/*
The variable digits must be written to the string "60".
Use the variables x, y, z, an empty string, and string concatenation.

Requirements:
• Do not change the values ​​of the variables x, y, z.
• To initialize the variable digits, use x, y, z, an empty string, and string concatenation.
• The program must display the variable digits on the screen.
*/
public class q17 {
     public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 0;
        int c = x + y;

        String digits = "" + (x+y) + z; //напишите тут ваш код

        System.out.println(digits);
    }
}
}
