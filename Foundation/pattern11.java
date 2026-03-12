/*
PALINDROMIC Pattern with Numbers pattern
*/

public class pattern11 {
  
  public static void main(String[] args) {
    int a = 5;

    for(int i = 1; i <= a; i++){

      for(int j = a-1; j >= i; j-- ){
          System.out.print(" ");
      }      

      for(int j = i; j >= 2; j--){
       
          System.out.print(j);
        
      }

      for(int j = 1; j <= i; j++){
          System.out.print(j);
          
      }

      System.out.println();
    
    }
  }

}

/*
output:     1
           212
          32123
         4321234
        543212345
*/