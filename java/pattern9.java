/*
DIAMOND pattern
*/

public class pattern9 {
  
  public static void main(String[] args) {
    int a = 4;
   

    for(int i = 1; i <= a; i++){
      
      for(int k = 1;k <= a-i; k++){
        System.out.print(" ");
      }

     
        for(int j = 1; j<=2*i-1; j++){
          System.out.print("*");
        }
        
        System.out.println();
       

    }

    for(int i = a-1; i >= 1; i--){
      
      for(int k = 1;k <= a-i; k++){
        System.out.print(" ");
      }

     
        for(int j = 1; j<=2*i-1; j++){
          System.out.print("*");
        }
        
        System.out.println();
       
    }
 
  }

}

/*
output:   *
         ***
        *****
       *******
        *****
         ***
          *
*/