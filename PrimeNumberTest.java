import java.util.*;

public class PrimeNumberTest
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a number");
    int n = input.nextInt();
    
    while (n <= 1) {
      System.out.println("Enter a number greater than 1");
      n = input.nextInt();
    }
    int i = 2;
    
    while (i <= n) {
      if (i == n) {
        System.out.println(n+" is a prime number");
        break;
      }
      
      if (n % i == 0) {
        System.out.println(n+" is not a prime number");
        break;
      }
      i++;
    }
  }
}
    
    
    
    
    
    
    
    
    
    
    
    