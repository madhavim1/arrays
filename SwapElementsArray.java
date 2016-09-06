/* Write a program to locate and swap only 2 elements 
 * which are not sorted in a given sorted array. 
 * For example given an array {1,2,5,6,4} locate 5 and 4 
 * and then swap them as they are not as per sorted order.
 */

package com.training.arrays;

import java.util.Arrays;

public class SwapElementsArray {
	
	public static void swapElements(int[] a) {
		System.out.println("Unsorted array :"+Arrays.toString(a));
		for(int i=1; i<a.length; i++) {
			if(a[i-1]>a[i]) {
				// x, y, z,
				// swap x<->z, z, y, x
				int temp = a[i];
				a[i] = a[i-2];
				a[i-2] = temp;
				// swap y<->x, z, x, y		
				temp = a[i];
				a[i] = a[i-1];
				a[i-1] = temp;
				break;
			}
		}
		System.out.println("Sorted array :"+Arrays.toString(a));

	}
	
	public static void main(String[] args) {
		int a[] = {1,2,5,6,4};
		swapElements(a);
	}

}
