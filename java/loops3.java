/*
 Write a program to find the factorialof any number entered by the user.
*/

import java.util.*;

public class loops3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int fac = 1;

    if (n == 0 || n == 1) {
      System.out.println("Factorial is 1");
      return;
      
    } else if(n < 0){
      System.out.println("Factorial is not defined for negative numbers");
    } else {

         for(int i = 1; i<=n; i++){
        fac = fac*i;
      }

      System.out.println("Factorial of " + n + " is " + fac);
    }

     
    sc.close();

    }
      
  
}


/*
output: Enter a number: 5
          Factorial of 5 is 120
        Enter a number: 0
          Factorial is 1
        Enter a number: -5
          Factorial is not defined for negative numbers
*/