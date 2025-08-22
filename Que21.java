package Array_45;

import java.util.*;

public class Que21 {

	public static void main(String[] args) {
		// Remove duplicate from array
		
		int[] arr={3,5,8,3,9,3,1};
        int n=arr.length;
		
		HashSet<Integer> unique=new HashSet<Integer>();
		
		for(int i=0;i<n;i++) {
			unique.add(arr[i]);
		}
		
		System.out.println(unique.toString());
	}

}
