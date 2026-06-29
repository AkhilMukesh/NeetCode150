package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestLength {
	
	public static void main(String[] args) {
		String s = "I am pradyumna khadanga pradyumn I am learning streams API in Java";
		
		String result = Arrays.stream(s.split(" ")).
				max(Comparator.comparing(String::length)).
				get();
		System.out.println(result);
		
		
		
		List<String> ls = Arrays.asList("Banana","Apple","Orange","Kwii","Watermelon");
		String lstr = ls.stream().max(Comparator.comparing(String::length)).get();
		System.out.println(lstr);
		
		
		
		//second highest length
		
		String SecondHeighest = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).
				reversed()).skip(1).findFirst().get();
		System.out.println(SecondHeighest);
		
		
		//second highest length how much 
		int ans = Arrays.stream(s.split(" ")).map(x->x.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(ans);
		
		
		//find occuerence of each word 
		//basically converting it to the map
		Map<String,Long> an = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(an);
		
		//given the string find the word with specifed numbers of vowels 
		//vowels - 2 
		
		Arrays.stream(s.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==2).forEach(System.out::println);
	}

}
