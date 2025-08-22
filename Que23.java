package Array_45;

import java.util.*;

public class Que23 {

	public static void main(String[] args) {
		// Reverse array in-place
		
		int[] arr={5,3,8,3,9,3,1};
        int n=arr.length;
        
        reverse(arr,n);
        System.out.println(Arrays.toString(arr));

	}
	
	public static void reverse(int[] arr, int n) {
		int start=0;
		int end=n-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}
