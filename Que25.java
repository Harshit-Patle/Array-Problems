package Array_45;

import java.util.*;

public class Que25 {

	public static void main(String[] args) {
		// Shift all elements one position left
		
		int[] arr={5,3,8,3,9,3,1};
        int n=arr.length;
        int k=2;
        
        while(k-->0) {
        	shiftLeft(arr, n);
        }
        
        System.out.println(Arrays.toString(arr));

	}
	
	public static void shiftLeft(int[] arr, int n) {
		int temp=arr[0];
		
		int index=0;
		for(int i=1;i<n;i++) {
			arr[index++]=arr[i];
		}
		arr[index++]=temp;
	}

}
