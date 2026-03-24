/*
Largest in Array [1, 5, 10, 6, 3, 5]
*/

public class Largestinarray {

  public static int largestnum(int number[]) {
    int largest = Integer.MIN_VALUE;

    for(int i = 0; i < number.length; i++){
      if (largest < number[i]) {
        largest=number[i];
        
      }
    }

    return largest;

  }
  

  public static void main(String[] args) {
    int number[] = {1, 5, 10, 6, 19};

    int result = largestnum(number);

    System.out.println(result);

  }

}

/*
output:  19

Time Complexity O(n)
Space Complexity O(1)
*/
