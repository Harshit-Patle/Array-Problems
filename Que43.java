package Array_45;

public class Que43 {

	public static void main(String[] args) {
		// Find sub array with max sum
		
		int[] arr= {2,3,-8,7,-1,2,3};
		int n=arr.length;
		System.out.println(subarrayMaxSum(arr, n));

	}
	
	public static int subarrayMaxSum(int[] arr, int n) {
		
		int maxSoFar=arr[0];
		int maxEnding=arr[0];
		for(int i=1;i<n;i++) {
			maxEnding=Math.max(maxEnding+arr[i], arr[i]);
			maxSoFar=Math.max(maxSoFar, maxEnding);
		}
		
		return maxSoFar;
	}

}
