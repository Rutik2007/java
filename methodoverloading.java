class methodoverloading
{
	public int multiply(int a,int b)
	{
		int prod=a*b;
		return prod;
	}
		public int multiply(int a,int b,int c)
		{
			int prod=a*b*c;
			return prod;
		}
			public static void main(String[] args)
			{
				methodoverloading ob=new methodoverloading();
				int prod1=ob.multiply(1,2);
				
				System.out.println("product of the three int value:"+prod1);
				int prod2=ob.multiply(1,2,3);
				
				System.out.println("product of the three int value:"+prod2);
			}
}