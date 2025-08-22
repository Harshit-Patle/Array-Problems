package Array_45;

import java.util.Arrays;

public class Que29 {

	public static void main(String[] args) {
		// Replace negative with 0
		
		int[] arr={5,-6,8,-1,-9,3,1};
        int n=arr.length;
        replaceNegativeWithZero(arr, n);
        System.out.println(Arrays.toString(arr));

	}
	
	public static void replaceNegativeWithZero(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				arr[i]=0;
			}
		}
	}

}
