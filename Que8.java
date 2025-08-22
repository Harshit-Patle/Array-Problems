package Array_45;

public class Que8 {

	public static void main(String[] args) {
		// No. of even and odd elements
		
		int[] arr={5,3,8,3,9,3,1};
        int n=arr.length;
        System.out.println(count(arr, n));

	}
	
	public static String count(int[] arr, int n) {
		int even=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				even++;
			}
		}
		return "Even:"+even+" Odd:"+(n-even);
	}

}
