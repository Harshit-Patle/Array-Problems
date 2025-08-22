package Array_45;

import java.util.HashSet;

public class Que38 {

	public static void main(String[] args) {
		// Find intersection of 2 arrays
		
		int[] arr1= {1,2,3,4};
		int[] arr2= {4,5,6};
		int n1=arr1.length;
		int n2=arr2.length;
		
		System.out.println(intersection(arr1, n1, arr2, n2));

	}
	
	public static String intersection(int[] arr1, int n1, int[] arr2, int n2) {
		HashSet<Integer> unique=new HashSet<Integer>();
		for(int i=0;i<n1;i++) {
			unique.add(arr1[i]);
		}
		
		for(int i=0;i<n2;i++) {
			unique.add(arr2[i]);
		}
		
		return unique.toString();
	}

}
