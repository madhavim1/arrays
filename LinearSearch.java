/* Write a program to perform a linear search on any 
 * given array.Linear search is the basic search where 
 * you look for the element to be searched in a sequential 
 * way.
 */

package com.training.arrays;

public class LinearSearch {
	
	public static void findElement(int[] a, int lookupNum) {
		for(int i=0; i<a.length; i++) {
			if(lookupNum == a[i]) {
				System.out.println("The element "+lookupNum+ "is at"
						+ " index "+i);
			}
		}
			
	}
	
	public static void main(String[] args) {
		int[] a = {23, 56, -9, 3, 0, -2, -11, 13};
		int lookupNum = -11;
		findElement(a, lookupNum);
	}

}
