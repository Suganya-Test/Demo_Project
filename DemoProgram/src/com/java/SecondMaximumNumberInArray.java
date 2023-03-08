package com.java;

public class SecondMaximumNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {12,70,81,10,6,5};

int first = 0;
int second = 0;

for (int i = 0; i < arr.length; i++) {
	if (arr[i] > first) {
		
		second=first;
		first=arr[i];

		}
	else if(arr[i]>second) {//50//78//65//85
		
		second=arr[i];
		}
}
System.out.println(second);
System.out.println(first);
	}

}
