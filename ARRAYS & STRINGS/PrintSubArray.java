/*
Prit SubArray [2, 4, 6, 8, 1]
*/

public class PrintSubArray {

    public static void subArray(int number[]) {

      int maxsum = Integer.MIN_VALUE;
      int temp;
    
        for(int i = 0; i < number.length; i++){

            for(int j = i; j<number.length; j++){
               temp = 0;

                for(int k = i; k <=j; k++){
                  System.out.print(number[k]);
                  temp = temp + number[k];

                }

                if (temp>maxsum) {
                  maxsum = temp;
                }

                System.out.println();
            }

            System.out.println();
          }
          System.out.print("maximum subarray sum is: " + maxsum);

    }
  
    public static void main(String[] args) {
      int number[] = {2, 4, 6, 8, 10};

      subArray(number);
    }

}

/*
output: 2
        24
        246
        2468
        246810

        4
        46
        468
        46810

        6
        68
        6810

        8
        810

        10

        maximum subarray sum is: 30


Time Complexity: O(n³)
Space COmplexity: O(1)
*/
