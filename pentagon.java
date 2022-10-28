import java.util.Scanner;
public class Q2
{
 public static void main(String[] args)
 {
 Scanner a = new Scanner(System.in);
 System.out.print("Enter the length from centre to vertex : ");
 double r = a.nextDouble();
 double s = 2*r*Math.sin(Math.PI/5);
 double area = (5*s*s)/(4*Math.tan(Math.PI/5));
 System.out.println("The area of the given pentagon is : "+Math.round(area*100)/100.0);
 }
}
