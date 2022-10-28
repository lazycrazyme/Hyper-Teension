import java.util.Scanner;
public class Q1
{
public static void main(String[] args)
{
System.out.println("Enter your status, 0 : Single , 1 : Married Or Qualified
Widow, 2 : Married Filing Separately");
Scanner status = new Scanner(System.in);
int stat = status.nextInt();
System.out.println("Enter your income");
Scanner income = new Scanner(System.in);
double inc = income.nextDouble();
double tax = 0;
switch (stat)
{
case 0:
{
if (inc <= 8350.0) tax = inc * 0.1;
else if (inc <= 33950.0) tax = (8350 * 0.1) + (inc - 8350*0.15);
else if (inc <= 82258.0) tax = (8350 * 0.1) +(33950-8350)*0.15 + (inc -
33950)*0.25;
else if (inc <= 171550.0) tax = (8350 * 0.1) +(33950-8350)*0.15 + (82250-
33950)*0.25 + (inc-82250)*0.28;
else
tax = (8350 * 0.1) +(33950-8350)*0.15 + (82250-33950)*0.25 +(171550-
82250)*0.28 + (inc - 171550);break;
}
case 1:
{
if (inc <= 16700.0) tax = inc * 0.1;
else if (inc <= 67900.0) tax = (16700 * 0.1) + (inc - 16700)*0.15;
else if (inc <= 137050.0) tax = (16700 * 0.1) +(67900-16700)*0.15 + (inc67900)*0.25;
else if (inc <= 208850.0) tax = (16700 * 0.1) +(67900-16700)*0.15 +
(137050-67900)*0.25 +(inc-137050)*0.28;
else
  tax = (16700 * 0.1) +(67900-16700)*0.15 + (137050-67900)*0.25
+(208850-137050)*0.28 + (inc-208851); break;
}
case 2:
{
if (inc <= 8350.0) tax = inc * 0.1;
else if (inc <= 33950.0);
else if (inc <= 33950.0) tax = (8350 * 0.1) + (inc - 8350)*0.15;
else if (inc <= 68525.0) tax = (8350 * 0.1) +(33950-8350)*0.15 +
(inc-33950)*0.25;
else if (inc <= 104425.0) tax = (8350 * 0.1) +(33950-8350)*0.15 +
(68525-33950)*0.25 +(inc-68525)*0.28;
else
tax = (8350 * 0.1) +(33950-8350)*0.15 + (68525-33950)*0.25
+(104425-68525)*0.28 + (inc-104425); break;
}
default : System.out.println("Error: invalid status");
}
System.out.println("Payable tax is " + tax);
}
} 
