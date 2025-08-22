package Array_45;

import java.util.Arrays;

public class Que35 {

	public static void main(String[] args) {
		// Move zeros to end
		
		int[] arr={5, 0, 8, 0, 0, 3, -9};
        int n=arr.length;
        moveZerosToEnd(arr, n);
        System.out.println(Arrays.toString(arr));

	}
	
	public static void moveZerosToEnd(int[] arr, int n) {
		
		int count=0;
		int index=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[index++]=arr[i];
			}
		}
		
		while(count-->0) {
			arr[index++]=0;
		}
		
	}

}
