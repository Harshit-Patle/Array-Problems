package Array_45;

import java.util.Arrays;

public class Que31 {

	public static void main(String[] args) {
		// Difference between largest and smallest element
		
		int[] arr={5,3,8,3,9,3,1};
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println(arr[n-1]-arr[0]);
	}

}
