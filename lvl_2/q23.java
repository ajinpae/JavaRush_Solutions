package lvl_2;
/*
Read three integers from the keyboard.
Display their arithmetic mean on the screen.

Input example:

51
101
201
Output example:

117
The arithmetic mean is a number equal to the sum of all numbers divided by their number.
Use division without remainder.

Requirements:
• The program must read three integers from the keyboard.
• The program must display the arithmetic mean of the read numbers on the screen.
*/
import java.util.Scanner;

public class q23 {
  public static void main(String[] args) {
        //напишите тут ваш код
      Scanner a = new Scanner(System.in);
        int z = a.nextInt() ;

    Scanner b = new Scanner(System.in);
        int x = b.nextInt() ;

     Scanner c = new Scanner(System.in);
        int v = c.nextInt() ;
      int f = (z+x+v)/3   ;
        System.out.println(f) ;

    }
}    
}
