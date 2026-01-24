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
public class constructorinheritance2
{
	public static void main(String[] args)
	{
		b obj=new b();
	}
}