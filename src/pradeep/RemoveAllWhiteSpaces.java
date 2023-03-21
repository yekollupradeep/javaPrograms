package pradeep;

import java.util.Scanner;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		String sentence =" J  A   V  A   I S  G O  O D.";
		System.out.println(" Original Sentence:"+sentence);
		
		sentence=sentence.replaceAll("\\s", "");
		System.out.println("After replacement:"+sentence);
	
		
	}

}
