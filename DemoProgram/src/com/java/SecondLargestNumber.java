package com.java;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,7,2,6,5,};
		
		int first = 0;
		int second = 0;
		
		for (int i = 0; i < arr.length; i++) {//0
			
			if (arr[i]>first) { //3>0 4>3 7>4 2>7 6>7 5>7
				
				second=first;//0 ,3,4
				first=arr[i];//3,4,7
			
			}
			
			else if(arr[i]>second) {//2>4 6>4 5>6
				
				second = arr[i];
			}
		}
		
System.out.println(second);
System.out.println(first);
	}

}
