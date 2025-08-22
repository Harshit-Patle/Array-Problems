package Array_45;

import java.util.Arrays;

public class Que30 {

	public static void main(String[] args) {
		// Replace all zeros with ones;
		
		int[] arr={5, 0, 8, 0, 0, 3, -9};
        int n=arr.length;
        replaceWithOnes(arr, n);
        System.out.println(Arrays.toString(arr));

	}
	
	public static void replaceWithOnes(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				arr[i]=1;
			}
		}
	}

}
