package Array_45;

import java.util.Arrays;

public class Que33 {

	public static void main(String[] args) {
		// Check if array is sorted
		
		int[] arr1={5,3,8,3,9,3,1};
        int n=arr1.length;
        int[] arr2=Arrays.copyOf(arr1, n);
        Arrays.sort(arr1);
        System.out.println(compare(arr1, arr2, n));

	}
	
	public static String compare(int[] arr1,int[] arr2, int n) {
		
		for(int i=0;i<n;i++) {
			if(arr1[i]!=arr2[i]) {
				return "Not Sortes";
			}
		}
		return "Sorted";
	}

}
