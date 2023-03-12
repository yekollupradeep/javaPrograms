package pradeep;

import java.util.Arrays;

public class hello2 {
	public static void main(String[] args) {
		String s="pradeep";
		Arrays.stream(s.split("")).distinct().forEach(System.out::print);
	}

}
