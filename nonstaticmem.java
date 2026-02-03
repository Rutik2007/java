class s
{
	public static int sum(int a,int b)
	{
		return a+b;
	}
}
class nonstaticmem
{
	public static void main(String[] args)
	{
		s h=new s();
		int a=s.sum(10,20);
		System.out.println(a);
	}
}