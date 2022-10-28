import java.util.Scanner;
public class Q5
{
 public static void main(String[] args)
 {
 System.out.println("Enter Number Of Values To be Printed");
 Scanner input = new Scanner(System.in);
 int n = input.nextInt();
 int a = 1;
 for(int b = 1; b <= n; b++)
 {
 System.out.printf("%-6d",getPentagonalNumber(b));
 if(a % 10 == 0)
 System.out.println();
 a++;
 }
 }
 public static int getPentagonalNumber(int b)
 {
 return (b * (3 * b - 1))/2;
 }
}
