package pradeep;
/* 
 WAP TO ENTER A STRING  AND RINT ALL VOWELS AND THE CONSONENTS PRESENT IN A STRING.
 */
public class Countdemo {
public static void main(String[] args) {
	int vowels=0,consonents=0;
	String str1="Pradeep is a Goog Boy and very hard worker";
	str1=str1.toLowerCase();
	for(int i=0;i<str1.length();i++) {
		if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')
		{
			vowels++;
			
		}
		else if(str1.charAt(i)>='a'&&str1.charAt(i)<='z') {
			consonents++;
		}
	}
	System.out.println("No.of Vowels Present is "+vowels);
	System.out.println("No.of Consonents present is "+consonents);
	
}
}
