/*
HOLLOW RHOMBUS pattern
*/

public class pattern8 {
  
  public static void main(String[] args) {
    int rows = 5;
    int cols = 5;

    for(int i = 1; i <= rows; i++){

      for(int k = rows-1; k >= i; k--){
        System.out.print(" ");
      }

        for(int j = 1; j <= cols; j++){
         
          if(i == 1 || j == 1 || i == rows || j == cols){
            System.out.print("*");
          } else {
            System.out.print(" ");
          }

        }

        System.out.println();

    }
  }

}

/*
output:    *****
          *   *
         *   *
        *   *
       *****
*/