package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DivideNumbersIntoEvenOrOdd {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,10,8,9,12,15,16,171,81,85,23,232};
		
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		
		//Map<Boolean,List<Integer>> ans =  list.stream().collect(Collectors.groupingBy(x->x%2==0,Collectors.toList()));
		
		List<List<Integer>> ans =  list.stream().collect(Collectors.groupingBy(x->x%2==0,Collectors.toList())).entrySet().stream().
				map(x->x.getValue()).collect(Collectors.toList());
		System.out.println(ans);
	}

}
