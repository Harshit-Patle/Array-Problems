package Array_45;

class Que5 {
    public static void main(String[] args) {
    	// Count the occurrence of a specific element
    	
        int[] arr={5,3,8,3,9,3,1};
        int n=arr.length;
        int target=3;
        System.out.println(count(arr, n, target));
    }
    public static int count(int[] arr,int n, int target) {
    	int count=0;
    	for(int i=0;i<n;i++) {
    		if(arr[i]==target) {
    			count++;
    		}
    	}
    	return count;
    }
}