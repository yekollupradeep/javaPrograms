package InterProgram;
/*
 WAP TO ENTER A STRING AND DISPLAY IN THE REVERSE OF THE STRING BY SCANNER.
 */
import java.util.Scanner;
public class ReversearrayScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String sentence=sc.nextLine();
		char letters[]=sentence.toCharArray();
		for(int i=letters.length-1; i>0;i--)
		{
			System.out.print(letters[i]);
		}
		
		
	}

}