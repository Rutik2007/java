import java.util.StringTokenizer;
public class Stringtokenizerdemo 
{
    public static void main(String[] args) 
	{
        String str="welcome to ksc and psc";
        StringTokenizer st = new StringTokenizer(str);
        System.out.println("Total Tokens="+ st.countTokens());

        while (st.hasMoreTokens()) 
		{
            System.out.println(st.nextToken());
        }
    }
}