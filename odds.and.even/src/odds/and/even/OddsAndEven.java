
package odds.and.even;

import java.util.Scanner;

public class OddsAndEven {

    public static void main(String[] args) {
       int even = 0;
       int odd = 0;
       int i;
       Scanner scanner = new Scanner (System.in);
       System.out.println("0-Quit, Enter a digit:");
       i = scanner.nextInt();
       while (i != 0){
           if (i % 2 == 0)
               even++;
           else if (i % 2 != 0)
               odd++;
           System.out.println("0-Quit, Enter a digit:");
           i = scanner.nextInt();
       }
       
       System.out.println("There is:" + odd + " odd numbers");
       System.out.println("There is:" + even + " even numbers");
       
    }
    
}
