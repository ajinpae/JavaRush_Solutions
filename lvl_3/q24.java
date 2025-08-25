   package lvl_3;
/*
Enter the outside temperature from the keyboard. If the temperature is less than 0, display the message "it's cold outside", otherwise - display the message "it's warm outside".

Requirements:
• The program must read the temperature value from the keyboard.
• The program must use the System.out.println() or System.out.print() command.
• If the temperature is less than 0, display only the message "it's cold outside".
• If the temperature is greater than or equal to 0, display only the message "it's warm outside".
*/
import java.util.Scanner;
public class q23 {
   public static void main(String[] args) {

        String cold = "на улице холодно";
        String warm = "на улице тепло";
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();


     if (temperature < 0)
      {System.out.println(cold);
 } else {
        System.out.println(warm)  ;  }

    }

  

}