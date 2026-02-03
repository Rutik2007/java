class main
{
	protected int speed;
}
class Bike extends main{
	void setSpeed(int s)
	{
		speed=s;
	}
int getSpeed()
{
	return speed;
}
}	
public class vehicle
{
	public static void main(String[] args)
{
	Bike b=new Bike();
	b.setSpeed(100);
	System.out.println("acsese sub class method"+b.getSpeed());
	main v=new main();
	System.out.println(v.speed);
}
}