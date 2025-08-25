package lvl_2;
/*Read three lines from the keyboard.
And then:

Display the third line unchanged.
Display the second line, having previously converted it to upper case.
Display the first line, having previously converted it to lower case.
Input example:

Line Number TIMES
Second line
Line 3
Output example:

Line 3
SECOND LINE
line number times
Requirements:
• The program must read three lines from the keyboard.
• The third line read must be displayed unchanged.
• The second line read must be displayed in upper case.
• The first line read must be displayed in lower case.
• All three lines must be displayed in the correct order: third, second, first.
*/
import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        //напишите тут ваш код
       Scanner one = new Scanner(System.in);
        String a = one.nextLine() ;

    Scanner two = new Scanner(System.in);
        String b = two.nextLine() ;

     Scanner three = new Scanner(System.in);
        String c = three.nextLine() ;

        System.out.println(c)  ;
        System.out.println(b.toUpperCase()) ;
        System.out.println(a.toLowerCase()) ;

    }
}    
}
