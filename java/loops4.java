/*
Write a program to print the multiplication table of a number N, entered by the 
user.
*/

import java.util.*;

public class loops4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    
    for(int i = 1; i<=10; i++){
      System.out.println(n + " * " + i + " = " + n*i);
    }

    sc.close();
  }
}
/*
output: Enter a number: 10
        10 * 1 = 10
        10 * 2 = 20
        10 * 3 = 30
        10 * 4 = 40
        10 * 5 = 50
        10 * 6 = 60
        10 * 7 = 70
        10 * 8 = 80
        10 * 9 = 90
        10 * 10 = 100
*/