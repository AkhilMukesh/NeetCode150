package neetcode;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,4,53,2,5,3,1};
		
		//1. Brute Force
		boolean bruteForceResult = containsDulicateBruteForce(nums);
		System.out.println(bruteForceResult);
		
		//optimal 1
		boolean bruteForceOptimal1 = containsDuplicateOptimal1(nums);
		System.out.println(bruteForceOptimal1);
		
		//optimal 2
		boolean bruteForceOptimal2 = containsDuplicateOptimal2(nums);
		System.out.println(bruteForceOptimal2);
		
		//Using streams
		boolean streamResult = containsDuplicateUsingStreams(nums);
		System.out.println(streamResult);

	}

	private static boolean containsDuplicateUsingStreams(int[] nums) {
		
		return  Arrays.stream(nums).distinct().count() < nums.length ;
	}

	private static boolean containsDuplicateOptimal2(int[] nums) {
		//using hashset
		HashSet<Integer> hs = new HashSet();
		for(int i=0;i<nums.length;i++) {
			if(hs.contains(nums[i])) {
				return true;
			}
			hs.add(nums[i]);
		}
		return false;
	}

	private static boolean containsDuplicateOptimal1(int[] nums) {
		Arrays.sort(nums);
		for(int i=1;i<nums.length;i++) {
			if(nums[i]==nums[i-1]) {
				return true;
			}
		}
		return false;
	}

	private static boolean containsDulicateBruteForce(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;i<nums.length;j++) {
				if(nums[i]==nums[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	

}
