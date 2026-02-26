/*
 Write a program that reads a set of integers, and then prints the sum of the
even and odd integers.
*/


import java.util.*;

public class loops2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    

    int number;
    int choose;
    int evenSum = 0;
    int oddSum = 0;

    do{
      System.out.println("Enter the number");
      number = sc.nextInt();

      if (number%2 == 0) {
        evenSum += number;
      } else {
         oddSum += number;
      }

      System.out.println("Do you want to continue? Press 1 for yes or 0 for no ");
      choose = sc.nextInt();

    }while(choose==1);

      System.out.println("Sum of even numbers: " + evenSum);
      System.out.println("Sum of odd numbers: " + oddSum);

 sc.close();
  }
}

/*
output:
Enter the number
5
Do you want to continue? Press 1 for yes or 0 for no
1
Enter the number
6
Do you want to continue? Press 1 for yes or 0 for no
1
Enter the number
9
Do you want to continue? Press 1 for yes or 0 for no
1
Enter the number
10
Do you want to continue? Press 1 for yes or 0 for no 1
0
Sum of even numbers: 16
Sum of odd numbers: 14


*/