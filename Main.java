import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
   Scanner s = new Scanner(System.in);
   System.out.println("addition");
   System.out.println("enter the numberfirst");
   int a = s.nextInt();
   System.out.println("enter the numbersecond");
    int b = s.nextInt();
   int sum = a + b;
   System.out.println("sum of the number is:" + sum);


  }
}
