import java.util.Scanner;
public class Q6
{
 public static int sumDigits(long n)
 {
 int numb, remainder, sum = 0 ;
 numb=(int)n;
 while(numb != 0)
 {
 remainder = numb % 10;
 numb = numb /10;
 sum = sum + remainder;
 }
 return sum;
 }
 public static void main(String args[])
 {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter an integer:");
 long number=input.nextLong();
 int result = sumDigits(number);
 System.out.println("The sum of the digits in "+ number +" is "+ result);
 }
}
