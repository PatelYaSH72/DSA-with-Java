/*
INVERTED & ROTATED HALF-PYRAMID pattern
*/

public class pattern2 {
 
    public static void main(String[] args) {
      int a = 4;
      

      for(int i = 1; i<=a; i++){

       for(int k = a-1; k>=i; k--){
          System.out.print(" ");
       }

        for(int j = 1; j<=i; j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }

}

/*
output:   *
         **
        ***
       ****
*/