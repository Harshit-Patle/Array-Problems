package Array_45;

import java.util.Arrays;

public class Que24 {

	public static void main(String[] args) {
		// Rotate array by k-positions
		
		int[] arr={5,3,8,3,9,3,1};
        int n=arr.length;
        int k=2;
        
        while(k-->0) {
        	shiftRight(arr, n);
        }
        
        System.out.println(Arrays.toString(arr));


	}
	
	public static void shiftRight(int[] arr, int n) {
		int temp=arr[n-1];
		
		int index=n-1;
		for(int i=n-2;i>=0;i--) {
			arr[index--]=arr[i];
		}
		arr[0]=temp;
	}

}
