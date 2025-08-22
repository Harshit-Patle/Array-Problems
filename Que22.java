package Array_45;

import java.util.HashMap;

public class Que22 {

	public static void main(String[] args) {
		// Count frequency of each element
		
		int[] arr={3,5,8,3,9,3,1};
        int n=arr.length;
        
        HashMap<Integer, Integer> freq=new HashMap<Integer, Integer>();
        
        for(int i=0;i<n;i++) {
        	freq.put(arr[i], freq.getOrDefault(arr[i], 0)+1);
        }
        
        System.out.println(freq.toString());
	}

}
