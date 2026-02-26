/*
 What is wrong in the following program?
*/

public class loops5 {
  public static void main(String args[]) {
    for (int i = 0; i <= 5; i++) {
      System.out.println("i = " + i);
    }
    System.out.println("i after the loop = " + i);
  }
}

/*
The variable i is declared inside the for loop, so its scope is limited to the loop block. It cannot be accessed outside the loop. Therefore, the last print statement causes a compilation error.
*/
