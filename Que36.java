package Array_45;

import java.util.Arrays;

public class Que36 {

	public static void main(String[] args) {
		// Arrange positive and negative alternate
		
		int[] arr= {1,2,3,4,-1,-2,-3,-4};
		int n=arr.length;
		rearrange(arr, n);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void rearrange(int[] arr, int n) {
		
		int negatives=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				negatives++;
			}
		}
		
		int[] neg=new int[negatives];
		int[] pos=new int[n-negatives];
		
		int pIdx=0;
		int nIdx=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				neg[nIdx++]=arr[i];
			}
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]>=0) {
				pos[pIdx++]=arr[i];
			}
		}
		
		pIdx=0;
		nIdx=0;
		
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				arr[i]=pos[pIdx++];
			}else {
				arr[i]=neg[nIdx++];
			}
		}
	}

}
