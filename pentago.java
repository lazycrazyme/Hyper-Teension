import java.util.Scanner;
public class Q51
{
 public static void main(String[] args)
 {
 System.out.println("Enter Number Of Values To be Printed");
 Scanner input = new Scanner(System.in);
 int n = input.nextInt();
 System.out.printf("%-6d",getPentagonalNumber(n));
 }
 public static int getPentagonalNumber(int b)
 {
 return (b * (3 * b - 1))/2;
 }
}
