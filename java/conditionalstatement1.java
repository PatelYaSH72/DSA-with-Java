/*
Write a Java program to get a number from the user and print whether it is
positive or negative.
 */

package javabasics;
import java.util.*;

public class conditionalstatement1{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int a = sc.nextInt();

    if (a>0) {
      System.out.println(a +" is positive number");
    }
    else if (a<0) {
      System.out.println(a + " is negative number");
    }
    else {
      System.out.println(a + "is zero");
    }
  }
}

/*
output: Enter a number: 5
          5 is positive number
        Enter a number: -5
          -5 is negative number
        Enter a number: 0
          0 is zero
*/