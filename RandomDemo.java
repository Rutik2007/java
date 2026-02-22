import java.util.Random;
public class RandomDemo 
{
    public static void main(String[] args)
	{
        Random r= new Random();
        int num =r.nextInt(100);
        float f =r.nextFloat();
        boolean b =r.nextBoolean();

        System.out.println("Integer= " + num);
        System.out.println("Float= " + f);
        System.out.println("Boolean= " + b);
        System.out.println("Double Value= " + (num * 2));
    }
}