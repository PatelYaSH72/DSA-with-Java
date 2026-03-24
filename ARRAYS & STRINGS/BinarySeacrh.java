/*
Binary Search  Array [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
               Target = 9
*/

public class BinarySeacrh {

  public static int BinarySearch(int number[], int target) {
    
    int start = 0;
    int end = number.length - 1;

    while (start <= end) {
      
      int mid =  start + (end - start)/2;

      if (number[mid] == target) {
        return mid;
      }
      if (number[mid] > target) {
        end = mid-1;
      } else {

        start = mid+1;

      }

    }

    return -1;


  }
  

  public static void main(String[] args) {
    int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int target = 10;

    int result = BinarySearch(number, target);
    if (result == -1) {
      System.out.println("Number is not in array");
    } else{

      System.out.println("Number in " + result + " Position");
    }

  }

}

/*
output: Number in 9 Position

Time Complexity: O(log n)
Space Complexity: O(1)
*/