package Array_45;

import java.util.*;

public class Que9 {

	public static void main(String[] args) {
		// Separate even and odd in 2 arrays
		
		int[] arr={5,3,8,3,9,3,1};
        int n=arr.length;
        separate(arr, n);

	}
	
	public static void separate(int[] arr, int n) {
		int e=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				e++;
			}
		}
		
		int[] even=new int[e];
		int[] odd=new int[n-e];
		int idxE=0;
		int idxO=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				even[idxE++]=arr[i];
			}else {
				odd[idxO++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
		
	}

}
