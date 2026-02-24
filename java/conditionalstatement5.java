/*
 WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthat
year is a leap year or not.
*/

package javabasics;
import java.util.*;

public class conditionalstatement5 {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int a = sc.nextInt();
    
      if (a%4 == 0) {

        if (a%100 == 0) {

          if (a%400 == 0) {
            System.out.println("Leep Year");
          } else{
            System.out.println("Not a Leep year");
          }
        }
        else{
          System.out.println("Leap year");
        }
        
      } else {
        System.out.println("Not a leap year");
      }
    }

}

/*
output: Enter a year: 2000
          Leap year
        Enter a year: 1900
          Not a leap year
*/