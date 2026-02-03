class sum
{
	int sum(int... number)
	{
		int s=0;
		for(int num: number)
			s+=num;
			return s;
	}
		public static void main(String[] args)
		{
			sum sc=new sum();
		System.out.println("sum"+sc.sum(73,45,34));
		
		System.out.println("sum"+sc.sum(32,42));
		}
}