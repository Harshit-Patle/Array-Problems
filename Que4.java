package Array_45;

public class Que4 {

	public static void main(String[] args) {
		// Find target element in the array
		int[] arr= {10,20,30};
		int n=arr.length;
		int target=20;
		System.out.println("Index of target element"+search(arr, n,target));

	}
	
	static int search(int[] arr,int n, int target) {
		
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	

}
