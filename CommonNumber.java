/* Write a program to find the common number in any 
 * given two arrays.
 */

package com.training.arrays;

public class CommonNumber {
	public static void findCommonNum(int[] a, int[] b) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println("The common number in two "
							+ "arrays is: "+a[i]);
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int a[] = {2,5,8,9,10};
		int b[] = {-2,6,0,7,9};
		findCommonNum(a, b);

	}

}
