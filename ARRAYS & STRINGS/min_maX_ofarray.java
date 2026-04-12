/*
Maximum and minimum of an array using minimum number of comparisons

Input: arr[] = [3, 5, 4, 1, 9]
Output: [1, 9]
*/

public class min_maX_ofarray{

  public static void min_max(int[] nums) {
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      int n = nums.length;

     if (nums[0] > nums[1]) {
          max = nums[0];
          min = nums[1];
     } else {
          max = nums[1];
          min = nums[0];
     }


     int i = 2;
     
     while (i < n-1) {
       
       int small,large;
        if (nums[i] > nums[i+1]) {
          small = nums[i+1];
          large = nums[i];  
        } else {
          small = nums[i];
          large = nums[i+1];
        }


        if (small < min) {
          min = small;
        }
        if (large > max) {
          max = large;
        }

        i += 2; 

     }


     if (i < n) {
      
      if (nums[i] < min) {
          min = nums[i];
      }
      if (nums[i] > max) {
          max = nums[i];
      }
     }


      System.out.print("[" + min + "," + max + "]");

  }
  

  public static void main(String[] args) {
    

    int[] nums = {22, 14, 8, 17, 35, 3};
    min_max(nums);
  }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/