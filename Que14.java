package Array_45;

public class Que14 {

	public static void main(String[] args) {
		// index of last occurrence of given element
		
		int[] arr={5,3,8,3,9,3,1};
        int n=arr.length;
        int target=3;
        System.out.println(lastOccurrence(arr, n, target));

	}
	
	public static int lastOccurrence(int[] arr, int n, int target) {
		for(int i=n-1;i>=0;i--) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}

}
