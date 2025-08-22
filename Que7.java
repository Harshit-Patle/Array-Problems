package Array_45;

import java.util.*;

public class Que7 {

	public static void main(String[] args) {
		// Check if array contains a given elements
		
		
		int[] arr={5,2,8,3,9,6,1};
        int n=arr.length;
        int target=3;
        Arrays.sort(arr);
        System.out.println(check(arr, n, target));
	}
	
	public static String check(int[] arr, int n, int target) {
		int start=0;
		int end=n;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==target) {
				return "Yes";
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return "No";
	}

}
