package Array_45;

public class Que3 {

	public static void main(String[] args) {
		// Max and Min element of an array
		int[] arr= {10,20,30};
		int n=arr.length;
		System.out.println("Min:"+min(arr, n));
		System.out.println("Max:"+max(arr, n));

	}
	public static int min(int[] arr,int n) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			min=Math.min(min, arr[i]);
		}
		return min;
	}
	public static int max(int[] arr,int n) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			max=Math.max(max, arr[i]);
		}
		return max;
	}

}
