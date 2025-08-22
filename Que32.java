package Array_45;


public class Que32 {

	public static void main(String[] args) {
		// Pair of elements whose sum is equal to given number
		
		int[] arr={5,3,8,7,9,0,1};
        int n=arr.length;
        int target=8;
        check(arr, n, target);

	}
	
	public static void check(int[] arr, int n, int target) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.print("("+arr[i]+","+arr[j]+") ");
				}
			}
		}
		System.out.println();
	}

}
