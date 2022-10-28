import java.util.Scanner;
public class Q3
{
 public static void main(String[] args)
 {
 Scanner in = new Scanner(System.in) ;
 System.out.println("Enter the number: ");
 int N = in.nextInt();
 if(N>=1||N<=20)
 {
 for(int i=1;i<=10; i++)
 System.out.println(N+" X "+i+" = "+N*i );
 }
 }
}
