import java.util.Scanner;
public class positive
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		if(num > 0)
		{
			System.out.println(num+ "is positive number");
		}
		else if(num < 0)
		{
			System.out.println(num+"is nagative number");
		}
		else
		{
			System.out.println("the number is zero");
		}
	}
}
