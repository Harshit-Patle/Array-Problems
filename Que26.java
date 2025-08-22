package Array_45;

import java.util.Arrays;

public class Que26 {

	public static void main(String[] args) {
		// Largest three elements in an array
		
		int[] arr={5,3,8,3,9,3,1};
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println(arr[n-3]+" "+arr[n-2]+" "+arr[n-1]);

	}

}
