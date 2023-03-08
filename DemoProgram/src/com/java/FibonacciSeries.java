package com.java;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int temp = 0;

int first = 0;

int second = 1;

for (int i = 1; i <=8; i++) {//condition correct goes to next line
	//1)initially first assigned as 0
	//2)when second i gets iterated i++ ,i becomes 2..then condition correct and goes to next line
	System.out.println(first);//now first becomes1
	
	temp = first+second;//first=0,second=1//fst=1+sec=1=2
	
	first = second;//first=1//first=1
	second = temp;//second=1//second=2
	
}

	}

}
