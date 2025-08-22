package Array_45;

import java.util.Arrays;

public class Que6 {

	public static void main(String[] args) {
		// Replace all occurrence of specific elements
		
		int[] arr={5,3,8,3,9,3,1};
        int n=arr.length;
        int target=3;
        int replaceWith=7;
        replace(arr, n, target,replaceWith);
        System.out.println(Arrays.toString(arr));

	}
	
	public static void replace(int[] arr,int n,int target, int replaceWith) {
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				arr[i]=replaceWith;
			}
		}
	}

}
