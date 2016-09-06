/* Write a program to find the missing number in a series 
 * of sorted numbers stored in an array.
 */

package com.training.arrays;

public class MissingNumber {
	
	public void findMissingNum(int[] a){
		//2,4,8,10
		// 2,6,8,10
		int delta1 = a[1]-a[0];
		for (int i=2;i<a.length;i++) {
			int delta2 = a[i]-a[i-1];
			if(2*delta1 == delta2) { // num missing in current interval
				System.out.println("missing number :"+(a[i-1]+delta1));
				return;
			} else if(delta1 == 2*delta2){ // num missing in prev interval
				System.out.println("missing number :"+(a[i-2]+delta2));
				return;
			} else if(delta1 != delta2) {
				System.out.println("Array is not in arithmetic series");
				return;
			}
		}
		System.out.println("Nothing is missing");
	}

	public static void main(String[] args) {
		int[] a = {2, 4, 8, 10};
		MissingNumber obj = new MissingNumber();
		obj.findMissingNum(a); 
	}

}
