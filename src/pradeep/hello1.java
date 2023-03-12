package pradeep;

public class hello1 {
public static void main(String[] args) {
	
	        String str = "PrAdEeP";
	        String upperCase = "";
	        String lowerCase = "";
	        
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            
	            if (Character.isUpperCase(c)) {
	                lowerCase += Character.toLowerCase(c);
	            } else {
	                upperCase += Character.toUpperCase(c);
	            }
	        }
	        
	        String output = upperCase + lowerCase;
	        System.out.println(output);
	    }
	

}

