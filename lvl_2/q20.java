package lvl_2;

/* 
The main method prints four lines to the screen. All of them are clear examples of capitalization abuse.
Change the code so that all of the letters in these lines are lowercase.

Requirements:
• Do not change the values ​​of the variables title, degree, and career.
• The four lines passed to the println method must have the toLowerCase method called.
• The program output must contain four lines.
*/
public class q20 {
      public static void main(String[] args) {
        String title = "Senior Lead Principal Software Engineer Data Architect";
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

        //напишите тут ваш код
        System.out.println("RESUME".toLowerCase());
        System.out.println("TITLE: ".toLowerCase() + title.toLowerCase());
        System.out.println("DEGREE: ".toLowerCase() + degree.toLowerCase());
        System.out.println("CAREER: ".toLowerCase() + career.toLowerCase());
    }
}  
}
