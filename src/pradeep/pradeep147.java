package pradeep;

public class pradeep147 {

	public static void main(String[] args) {
		int size=3;
		for (int i=size; i>=size;i--)
		{
			for (int col = size;col>=Math.abs(i); col--)
			{
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
