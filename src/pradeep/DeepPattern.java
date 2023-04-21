package pradeep;

public class DeepPattern {
	public static void main(String[] args) {
		/*
		 l l l
		  eee
		  eve
		  eee
		  l l l*/
		char ch[]= {'l','e','v','e','l'};
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				for(int k=0;k<ch.length;k++) {
					if(i+j==10) {
						System.out.print(ch[k]);
					}
				}
			}
			System.out.println();
		}
	}

}
