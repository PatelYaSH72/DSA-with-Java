/*
INVERTED HALF-PYRAMID with Numbers pattern
*/

public class pattern3 {
  public static void main(String[] args) {
    
      int a = 5;

      for(int i = a; i>=1; i--){
        // System.out.print(i);

        for(int j = 1; j<=i; j++){
          System.out.print(j);
        }
        System.out.println();
      }

  }
}

/*
output: 12345
        1234
        123
        12
        1
*/