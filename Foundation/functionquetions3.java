
/*
Write a Java program tocheckif a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not)
Anumberis called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
palindrome because the reverse of 321 is 123, which is not equal to 321.
*/

public class functionquetions3 {

   public static int renum(int n) {
    
    int renum = 0;

    while (n>0) {
      int lastint = n%10;
      renum = (renum * 10) + lastint;
      n = n/10;
    }
    return renum;

   }
  
   public static void palidrome(int n){
      int resNum = renum(n);

      if(resNum == n){
          System.out.println(n + " is palidrome number");
      } else {
        System.out.println(n + " is not palidrome");
      }
   }
    public static void main(String[] args) {
      palidrome(121);
    }

}

/*
output: 121 is palidrome number
output: 123 is palidrome number
output: 145 is not palidrome
*/