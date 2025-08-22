package Array_45;

import java.util.HashMap;
import java.util.Map;

public class Que42 {

	public static void main(String[] args) {
		// Find the duplicate number in the array
		
		int[] arr={5,1,3,1,6,7,5,7,6};
        int n=arr.length;
        
        System.out.println(findSingle(arr, n));

	}
	
	public static int findSingle(int[] arr, int n) {
		HashMap<Integer, Integer> freq=new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++) {
			freq.put(arr[i], freq.getOrDefault(arr[i], 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry:freq.entrySet() ) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		return Integer.MIN_VALUE;
	}

}
