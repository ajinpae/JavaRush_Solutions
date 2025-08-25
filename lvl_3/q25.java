package lvl_3;

/*
Enter the name and age from the keyboard. If the age is between 18 and 28 (inclusive), then output the message "Name, report to the military registration and enlistment office", where Name is the name previously entered from the keyboard.

Input example:
Amigo
18
Output example:
Amigo, report to the military registration and enlistment office

Requirements:
• The program must read data from the keyboard twice.
• The program must use the System.out.println() or System.out.print() command.
• If the age is between 18 and 28 (inclusive), then output only the message "Name, report to the military registration and enlistment office".
• If the age is not within the specified range, then nothing needs to be output.
*/
import java.util.Scanner;

public class q25 {
      public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        //напишите тут ваш код


        Scanner cool = new Scanner(System.in);
        String name = cool.nextLine();

         Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        if (age >= 18 && age <= 28)
          {System.out.println(name +
    militaryCommissar   );
        }



    }
}
