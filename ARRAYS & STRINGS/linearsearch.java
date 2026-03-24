/*
Linear Search [2, 4, 6, 8, 10, 12, 14, 16]
target = 10

*/

public class linearsearch{

  public static int linearSrch(int number[], int target) {
    
      for(int i = 0; i < number.length; i ++){
            if (number[i] == target) {
                return i;
            }
        }
          return -1;

  }

  public static void main(String[] args) {
    int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
    int target = 10;

    
    int result = linearSrch(number, target);
    
    if (result == -1) {
      System.out.println("Does not have a number");
    } else {

      System.out.println("Number on "+ result + " position");
    }
  }

}

/*
output: Number on 4 position

output: Does not have a number

Time Complexity is O(n)
Space Complexity is O(1)
*/