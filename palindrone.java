import java.util.Scanner;
public class Q7
{
 static boolean isPalindrome(String word)
 {
 int i = 0 , j = word.length() - 1;
 while (i < 0)
 {
 if (word.charAt(i) != word.charAt(j))
 return false;
 i++;j--;
 }
 return true;
 }
 public static void main(String[] args)
 {
 System.out.println("Enter the word: ");
 Scanner a = new Scanner(System.in);
 String word = a.nextLine();
 word = word.toLowerCase();
 if (isPalindrome(word))
 System.out.print("Yes, the word is a palindrome");
 else
 System.out.print("No, the word is not a palindrome");
 }
}
