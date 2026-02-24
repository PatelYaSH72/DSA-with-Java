/*
Writea Java program to input week number(1-7) and print day of week name
using switch case.
*/

package javabasics;
import java.util.*;

public class conditionalstatement3 {
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a week number: ");
      int week = sc.nextInt();

      switch(week){

        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
        case 7:
          System.out.println("Sunday");
          break;
        default:
          System.out.println("Invalid week number");

      }


    }

}


/*
output: Enter a week number: 5
          Friday
        Enter a week number: 9
          Invalid week number

*/