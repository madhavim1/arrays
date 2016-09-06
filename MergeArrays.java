/* Write a program to merge 2 arrays. */

package com.training.arrays;

import java.util.Arrays;

public class MergeArrays {
	
	public static void MergeArrays(int[] a, int[] b) {
		int c[] = new int[a.length+b.length];
		int i=0, j=0, k=0;
		while(i<a.length && j<b.length) {
			if(a[i] > b[j]) {
				c[k++] = b[j++];
			} else {
				c[k++] = a[i++];
			}
		}
		while(i<a.length) {
			c[k++] = a[i++];
		}
		while(j<b.length) {
			c[k++] = b[j++];
		}
		System.out.println("Merged Array is: "+Arrays.toString(c));
	}

	public static void main(String[] args) {
		int[] a = {2, 14, 36, 67, 78};
		int[] b = {1, 22, 33, 67, 89, 97};
		MergeArrays(a, b);
	}

}
