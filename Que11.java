package Array_45;

import java.util.*;

public class Que11 {

	public static void main(String[] args) {
		// merge 2 array in third array
		
		int[] arr1={5,3,8};
		int[] arr2= {3,9,3,1};
        int n1=arr1.length;
        int n2=arr2.length;
        
        int n=n1+n2;
        int[] arr=new int[n];
        
        merge(arr1, arr2, n1, n2, n, arr);
        
        System.out.println(Arrays.toString(arr));

	}
	
	
	public static void merge(int[] arr1, int[] arr2, int n1, int n2, int n, int[] arr) {
		int index=0;
		for(int i=0;i<n1;i++) {
			arr[index++]=arr1[i];
		}
		
		for(int i=0;i<n2;i++) {
			arr[index++]=arr2[i];
		}
	}
}
