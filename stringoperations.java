public class stringoperations 
{
    public static void main(String[] args)
	{

        String s1 = "Hello";
        String s2 = "World";
		String s3 = s1 + " " + s2;
        System.out.println("Concat= " + s3);
		System.out.println("Length= " + s3.length());
        System.out.println("Equal= " + s1.equals(s2));
		System.out.println("Substring= " + s3.substring(0, 5));
		System.out.println("Upper= " + s3.toUpperCase());
        System.out.println("Lower= " + s3.toLowerCase());
    }
}