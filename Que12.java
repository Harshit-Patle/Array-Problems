package Array_45;

public class Que12 {

	public static void main(String[] args) {
		// Compare 2 arrays for equality
		
		int[] arr1= {1,2,3,4};
		int[] arr2= {1,2,3,4};
		int n1=arr1.length;
		int n2=arr2.length;
		
		System.out.println(compare(arr1, arr2, n1, n2));
	}
	
	public static String compare(int[] arr1,int[] arr2, int n1, int n2) {
		if(n1!=n2) {
			return "Not Equal";
		}
		
		for(int i=0;i<n1;i++) {
			if(arr1[i]!=arr2[i]) {
				return "Not Equal";
			}
		}
		return "Equal";
	}

}
