/* Write a program to sort an array. */

package com.training.arrays;

import java.util.Arrays;

public class SortArray {
	
	public static void sortArray(int[] a) {
		System.out.println("Array before sorting :"+Arrays.toString(a));
		int temp = a[0];
		//20, 1, 18, 4
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println("Array after sorting :"+Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		int a[] = new int[args.length]; 
		int i=0;
		for(String s: args) {
			a[i++] = Integer.parseInt(s);
		}
		//int[] a = {1, 18, -20, 4, 0};
		sortArray(a);
		
	}

}
