public class ppp
{
	public String publicvar="public";
	private String privatevar="private";
	protected String protectedvar="protected";
	
	String defualt="defualt";
	public void display()
	{
		System.out.println("privatevar");
	}
}
class test extends ppp
{
	void show()
	{
		System.out.println(publicvar);
		System.out.println(protectedvar);
	}
}
	