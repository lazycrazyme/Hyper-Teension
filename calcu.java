import java.util.Scanner;
public class Q4
{
 public static void main(String[]args)
 {
 Scanner in = new Scanner(System.in);
 int a=0,b=0,input,repeat;
 do {
 System.out.println();
 System.out.println("Enter 1st number :");
 a = in.nextInt();
 System.out.println("Enter 2nd number: :");
 b = in.nextInt();
 System.out.println("To perform addition, Enter 1");
 System.out.println("To perform subtraction, Enter 2");
 System.out.println("To perform multiplication, Enter 3");
 System.out.println("To perform division, Enter 4");
 System.out.println("To Exit, Enter 5");
 System.out.println();
 System.out.println("Enter choice: ");
 input = in.nextInt();
 switch(input)
 {
 case 1: System.out.println("Adding the numbers: "+ (a+b) ); break;
 case 2: System.out.println("Subtracting the numbers: "+ (a-b)); break;
 case 3: System.out.println("Multiplying the numbers: "+ (a*b)); break;
 case 4: if (b == 0)
 System.out.println("It is undefined");
 else
System.out.println("Dividing the numbers: "+ "The quotient
is"+(a/b)+"\nand the remainder is "+(a%b) );break;
 case 5: System.out.println("Thank you for using the calculator!");
 break;
 default: System.out.println("Please provide with the correct input");
 }
 System.out.println("Do you want to continue?1.Yes 2.No");
 repeat = in.nextInt();
 }
 while (repeat==1);
}
}
