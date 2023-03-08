package com.java;

public class MaximumAndMinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 8, 15, 6, 4 };

		int maxi = 0;
		int mini = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > maxi) {

				maxi = arr[i];
			}

			else if (mini > arr[i]) {

				mini = arr[i];

			}
		}
		System.out.println(maxi);
		System.out.println(mini);
	}

}
