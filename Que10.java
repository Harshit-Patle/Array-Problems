package Array_45;

import java.util.*;

public class Que10 {

	public static void main(String[] args) {
		// Copy elements from one array to another
		
		int[] arr={5,3,8,3,9,3,1};
        int n=arr.length;
        
        int[] copyArr=new int[n];
        copy(arr,n, copyArr);
        System.out.println(Arrays.toString(copyArr));

	}
	
	public static void copy(int[] arr, int n, int[] copyArr) {
		for(int i =0;i<n;i++) {
			copyArr[i]=arr[i];
		}
	}

}
