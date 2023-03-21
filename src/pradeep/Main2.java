package pradeep;

public class Main2 {
	static int quiz(int x, int y) {
		if(y==1)
			return x;
		else
			return x+ quiz( x, y-1);
		
	}
	public static void main(String[] args) {
		System.out.println(quiz(2,3));
	}

}
