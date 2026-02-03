class basic 
{
		String name;
		int id;
		basic(String name,int id)
		{
			this.name=name;
			this.id=id;
		}

void display()
{
	System.out.println("name" +name+ "id"+id);
}
	public static void main(String[] args)
	{
		basic b=new basic("rutik",102);
		b.display();
	}
}

