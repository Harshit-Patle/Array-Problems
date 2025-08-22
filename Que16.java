package Array_45;

import java.util.*;

public class Que16 {

	public static void main(String[] args) {
		// Shift all elements one position right
		
		int[] arr={5,3,8,3,9,3,1};
        int n=arr.length;
        shiftRight(arr, n);
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
