
package palindrome;

import java.util.Scanner;


public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";
        System.out.println("Input a word:");
        word = scanner.next();
        String reverse = new StringBuffer (word).reverse().toString();
        if (word.compareTo(reverse) == 0){
            System.out.println(word + " is a Palindrom");
        } else
            System.out.println(word + " is not a Palindrom");   
    }
    
}
