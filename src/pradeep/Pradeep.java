package pradeep;

public class Pradeep {
public static void main(String[] args) {
	String s="My name is rahul";
	String str[]=s.split(" ");
	String s1="";
	for(int i=0;i<str.length;i++) {
		
			s1=str[i]+" "+s1;
			
		
	}
	System.out.print(s1);
	
}
}

