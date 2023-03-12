package Demo;

public class Demo1 {
	public static void main(String[] args) {
	    int a=10;
		int b=2;
		int c=20;
		
		try
		{
			System.out.println(a/b);
			System.out.println(c/a);
			System.out.println("Duniya Madarchod");
			System.out.println("I Love U Mamaya");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("We should not divisble by 0");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("We should not divisble by 0");
		}
		
		
	finally
		{
			System.out.println("Fuck The World");
			
		}
	
		
	}
}


