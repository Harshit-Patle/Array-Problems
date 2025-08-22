package Array_45;

import java.util.HashMap;

public class Que44 {

	public static void main(String[] args) {
		// Count subarray with given sum
		
		int[] arr= {1,2,3};
		int n=arr.length;
		int sum=3;
		System.out.println(count(arr, n, sum));

	}
	
	public static int count(int[] arr, int n, int sum) {
		HashMap<Integer, Integer> prefixCount= new HashMap<Integer, Integer>();
		prefixCount.put(0, 1);
		int prefixSum=0;
		int count=0;
		for(int a:arr) {
			prefixSum+=a;
			if(prefixCount.containsKey(prefixSum-sum)) {
				count+=prefixCount.get(prefixSum-sum);
			}
			
			prefixCount.put(prefixSum, prefixCount.getOrDefault(prefixSum, 0)+1);
		}
		
		return count;
	}

}
