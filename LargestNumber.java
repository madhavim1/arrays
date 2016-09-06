//  Write a program to find the largest number in a given array.


package com.training.arrays;

public class LargestNumber {
	
	public static void findLargestNum(int[] a){
		if(a.length==0) 
			return;
		int max = a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i])
				max = a[i];
		}
		System.out.println("Largest number:"+max);
	}

	public static void main(String[] args) {
		try {
			int a[] = new int[args.length]; 
			int i=0;
			for(String s: args) {
				a[i++] = Integer.parseInt(s);
			}
			findLargestNum(a);
		}
		catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
	}

}
