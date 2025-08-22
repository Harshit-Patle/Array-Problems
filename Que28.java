package Array_45;

public class Que28 {

	public static void main(String[] args) {
		// Sum of even and odd elements
		
		int[] arr={5,3,8,3,9,3,1};
        int n=arr.length;
        System.out.println(sum(arr, n));

	}
	
	public static String sum(int[] arr, int n) {
		int even=0;
		int odd=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				even+=arr[i];
			}
			else {
				odd+=arr[i];
			}
		}
		return "Even:"+even+" Odd:"+odd;
	}

}
