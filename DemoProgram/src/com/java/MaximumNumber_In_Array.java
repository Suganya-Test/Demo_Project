package com.java;

public class MaximumNumber_In_Array{
	
	public static void main(String[] args) {
		
		int arr[] = {10,56,5,78,8,3};
		
		int maxi = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i]>maxi) {
				
				maxi = arr[i];
			
			}
		}
	System.out.println(maxi);
	}
	
}
  
