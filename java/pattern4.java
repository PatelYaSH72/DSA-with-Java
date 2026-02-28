/*
FLOYD'S Triangle pattern
*/

public class pattern4 {
  public static void main(String[] args) {
    
    int a = 5;
    int b = 1;

    for(int i = 1; i <= a; i++){
        
        for(int j = 1; j <= i; j++){

          System.out.print(b);
          b++;
        }
        System.out.println();

    }
  }
}

/*
output: 1
        23
        456
        78910
        1112131415
*/