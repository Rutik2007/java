import java.io.*;
class javacons
{
	String name;
	int id;
	javacons(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	javacons(javacons obj2)
	{
		this.name=obj2.name;
		this.id=obj2.id;
	}
}
class copycostructor
{
	public static void main(String[] args)
	{
		javacons ob=new javacons("rutik",45);
		System.out.println("name:"+ob.name+"and id:"+ob.id);
		javacons ob1=new javacons(ob);
		System.out.println("copycostructor used" );
		System.out.println("name:"+ob1.name+"and id:"+ob1.id);
	}
}