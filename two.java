import java.util.*;

public class two {
  public static void main(String [] args)
  {
    System.out.println("Wlcom to Claculator");
    Scanner sc = new Scanner(System.in);
    System.out.print("Please Enter the first number: ");
    int a = sc.nextInt();

    System.out.print("Now,Please Enter the second number: ");
    int b = sc.nextInt();
    int sum;
    sum = a + b;
    System.out.println("Sum of your number is: " + sum);
  }  
}
