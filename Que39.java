package Array_45;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Que39 {

	public static void main(String[] args) {
		// Find union of 2 array
		
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {4,5,6};
		int n1=arr1.length;
		int n2=arr2.length;
		
		System.out.println(union(arr1, n1, arr2, n2));

	}
	
	public static String union(int[] arr1, int n1, int[] arr2, int n2) {
		HashMap<Integer, Integer> freq=new HashMap<Integer, Integer>();
		for(int i=0;i<n1;i++) {
			freq.put(arr1[i], freq.getOrDefault(arr1[i], 0)+1);
		}
		for(int i=0;i<n2;i++) {
			freq.put(arr2[i], freq.getOrDefault(arr2[i], 0)+1);
		}
		
		ArrayList<Integer> duplicate=new ArrayList<Integer>();
		
		for(Map.Entry<Integer, Integer> entry:freq.entrySet() ) {
			if(entry.getValue()>1) {
				duplicate.add(entry.getKey());
			}
		}
		
		return duplicate.toString();
	}

}
