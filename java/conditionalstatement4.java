/*
What will be the value of x & y in thefollowing program:
*/

package javabasics;

public class conditionalstatement4 {
  
  public static void main(String[] args) {
    int a = 63, b = 36;
    boolean x = (a < b ) ? true : false;
    int y = (a > b ) ? a : b;

    System.out.println(x + " " + y);
  }

}

/*
output: false 63 
*/