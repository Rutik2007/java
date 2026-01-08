public class constuctorOverloading
{

	String model;
	int year;
	constuctorOverloading()
	{
		year=2006;
		model="alpha";
	}
	constuctorOverloading(int year)
	{
		this.year=year;
		model="beta";
	}
	constuctorOverloading(int year,String model)
	{
		this.year=year;
		this.model=model;
	}
	void display()
	{
		System.out.println("year: "+year+"model: "+model);	
	}
	public static void main(String[] args)
	{
		constuctorOverloading c1=new constuctorOverloading();
		constuctorOverloading c2=new constuctorOverloading(2007);
		constuctorOverloading c3=new constuctorOverloading(2008,"rutik");
		c1.display();
		c2.display();
		c3.display();
	}
}

		
		