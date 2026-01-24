class a
{
	a()
	{
		System.out.println("class a's Constructor is invoked");
	}
}
class b 
{
	b()
		{
			System.out.println("class b's Constructor is invoked");
		}
}
class c extends b
{
	c()
	{
		System.out.println("class b's Constructor is invoked");
	}
}
public class constructorinheritance3
{
	public static void main(String[] args)
	{
		c obj=new c();
	}
}