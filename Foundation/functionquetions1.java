/*
Write a Java method to compute the average of three numbers.
*/

public class functionquetions1{

  public static void Avgof3Num(int a, int b, int c) {
    
    int sumAvg = (a + b + c)/3;

    System.out.println(sumAvg);

  }

  public static void main(String[] args) {

    int a = 3;
    int b = 3;
    int c = 3;

    Avgof3Num(a, b, c);
  }

}

/*
output: 3
*/