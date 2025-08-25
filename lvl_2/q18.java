package lvl_2;
/*
The hugeAmount variable must be set to the number 100500.
Use the bigAmount, greatAmount, and string-to-number conversion variables.
Use one command to declare and initialize hugeAmount.

Requirements:
• Do not change the values ​​of the bigAmount and greatAmount variables.
• To initialize the hugeAmount variable, use bigAmount, greatAmount, and the Integer.parseInt(String) method.
• The program must display the hugeAmount variable.
*/
public class q18 {
     public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";




        int hugeAmount = Integer.parseInt(greatAmount)
         + Integer.parseInt(bigAmount)   ;
         //напишите тут ваш код

        System.out.println(hugeAmount);
    }
}
    
}
