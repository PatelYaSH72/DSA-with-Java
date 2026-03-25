/*
Pairs in an Array [2, 4, 6, 8, 10]
*/

public class PairInArray {
  

    public static void pairArray(int number[]) {
      
        for(int i = 0; i < number.length ; i++){
          

          for(int j = i+1; j<number.length ; j++){
            System.out.print("(" + number[i] + "," + number[j] + ")");
          }
          System.out.println();

        }

    }

    public static void main(String[] args) {
      int number[] = {2, 4, 6, 8, 10};
      pairArray(number);

    }

}

/*
output: (2,4)(2,6)(2,8)(2,10)
        (4,6)(4,8)(4,10)
        (6,8)(6,10)
        (8,10)


Time Complexity: O(n²)
Space Complexity: O(1)
*/