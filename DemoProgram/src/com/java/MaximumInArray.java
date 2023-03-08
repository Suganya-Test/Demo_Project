package com.java;

public class MaximumInArray {

	public static void main(String[] args) {
		
		int arr[] = { 10, 56, 5, 78, 8, 3 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > temp) {// arr[0]=10>0,arr[1]=56>10,arr[2]=5>56 false,arr[3]=78>56,
								// arr[4]=8>78false,arr[5]=3>78 false
				temp = arr[i];// 10,56,78 stayed in 78
			}

		}
		System.out.println(temp);
	}

}
