class Area
{
		int length;
		int breadth;
		void getdata()
			{
				int A=length*breadth;
				System.out.println("Area"+A);
			}
}
class main
{

	public static void main(String[] args)
	{
		Area obj=new Area();
		
		obj.length=5;
		obj.breadth=7;
		obj.getdata();
	}
}
