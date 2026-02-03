import java.util.Scanner;
public class palindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		String str=sc.next();
		String rev=new StringBuilder(str).reverse().toString();
			if(str.	equals(rev))
			{
				System.out.println(str+"is palindrome number");
			}
			else
			{
				System.out.println(str+"is not palindrome number");
			}
	}
}


