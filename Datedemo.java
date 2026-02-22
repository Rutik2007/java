import java.util.Date;
import java.text.SimpleDateFormat;
public class Datedemo
 {
    public static void main(String[] args)
	{
        Date d = new Date();
        SimpleDateFormat abc=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(abc.format(d));
    }
}