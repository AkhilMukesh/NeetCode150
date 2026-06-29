package java8;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String s = "qwhjdyfsjfngytrsdltwjadbjgyufad";
		
		//s.chars().distinct().mapToObj(x->(char)x).forEach(System.out::print);
		Arrays.stream(s.split("")).distinct().forEach(System.out::print);

	}
}
