abstract class Shape 
{
    abstract double area();
}
class Circle extends Shape
 {
    double r=5;
	double area() 
	{
        return 3.14 * r * r;
    }
}

public class Shapecircle

{
    public static void main(String[] args) 
	{
        Circle c=new Circle();
        System.out.println("Area = " + c.area());
    }
}