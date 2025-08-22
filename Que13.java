package Array_45;

public class Que13 {

	public static void main(String[] args) {
		// index of first occurrence of given element
		
		int[] arr={5,3,8,3,9,3,1};
        int n=arr.length;
        int target=3;
        System.out.println(firstOccurrence(arr, n, target));

	}
	
	public static int firstOccurrence(int[] arr, int n, int target) {
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}

}
