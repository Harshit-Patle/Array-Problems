package Array_45;

import java.util.HashSet;

public class Que45 {

	public static void main(String[] args) {
		// Length of longest subarray having all unique elements
		
		int[] arr= {1,2,3,2,4,5,6};
		int n=arr.length;
		System.out.println(subarray(arr, n));

	}
	
	public static int subarray(int[] arr, int n) {
		HashSet<Integer> uniqueElements = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
        	
            while (uniqueElements.contains(arr[right])) {
                uniqueElements.remove(arr[left]);
                left++;
            }
            
            uniqueElements.add(arr[right]);

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
		
	}

}
