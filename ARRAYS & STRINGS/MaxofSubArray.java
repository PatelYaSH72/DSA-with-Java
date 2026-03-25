
/*
Prit SubArray [2, 4, 6, 8, 10]
Find maximum subarray sum
Find manimum subarray sum
*/

public class PrintSubArray {

    public static void subArray(int number[]) {

      int maxsum = Integer.MIN_VALUE;
      // int minnum = Integer.MAX_VALUE;
      int prefix[] = new int[number.length];
      int temp;

      prefix[0] = number[0];
      for(int i = 1; i < prefix.length; i++){
          prefix[i] = prefix[i-1] + number[i];
      }
    
        for(int i = 0; i < number.length; i++){

            for(int j = i; j<number.length; j++){
               temp = 0;

                temp = i == 0? prefix[j]: prefix[j] - prefix[i];

                // if (temp<minnum) {
                //   minnum = temp;
                // }

                if (temp>maxsum) {
                  maxsum = temp;
                }

                System.out.println();
            }

            System.out.println();
          }
          System.out.println("maximum subarray sum is: " + maxsum);
          // System.out.print("manimum subarray sum is: " + minnum);

    }
  
    public static void main(String[] args) {
      int number[] = {2, 4, 6, 8, 10};

      subArray(number);
    }

}

/*
output: 
        maximum subarray sum is: 30
        manimum subarray sum is: 2

Time Complexity: O(n²)
Space COmplexity: O(1)
*/
