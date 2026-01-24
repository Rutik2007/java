class a
{
	a()
	{
		System.out.println("class a's Constructor is invoked");
	}
}
class b extends a
{
	b()
		{
			System.out.println("class b's Constructor is invoked");
		}
}
public class constructorinheritance1
{
	public static void main(String[] args)
	{
		a obj=new a();
	}
}