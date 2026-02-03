class s
{
	public static int sum(int a,int b)
	{
		return a+b;
	}
}
class staticmem
{
	public static void main(String[] args)
	{
		int n=3;
		int m=6;
		int r=s.sum(n,m);
		System.out.println("sum is="+r);
	}
}