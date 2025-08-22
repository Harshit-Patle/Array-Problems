package Array_45;

import java.util.Arrays;

public class Que19 {

	public static void main(String[] args) {
		// Second largest element in array
		
		int[] arr={5,3,8,3,9,3,1};
        int n=arr.length;
        Arrays.sort(arr);
        reverse(arr, n);
        System.out.println(arr[1]);

	}
	
	public static void reverse(int[] arr, int n) {
		int start=0;
		int end=n-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}
