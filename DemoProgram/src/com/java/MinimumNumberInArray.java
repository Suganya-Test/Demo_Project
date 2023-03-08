package com.java;

public class MinimumNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {5,2,8,1,3};

int mini = arr[0];

for(int i = 0; i<arr.length; i++) {
	
	if(mini>arr[i]) {//5>5,5>2,2>8,2>1,1>3
		
		mini = arr[i];//2,1
	}
	
}
System.out.println(mini);
	}

}
