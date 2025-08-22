package Array_45;

public class Que2 {

	public static void main(String[] args) {
		// Average of all elements of array
		
		int[] arr= {10,20,30};
		int n=arr.length;
		System.out.println(avg(arr, n));

	}
	public static int avg(int[] arr,int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		return sum/n;
	}

}
