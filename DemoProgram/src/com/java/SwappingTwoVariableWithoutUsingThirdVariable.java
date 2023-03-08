package com.java;

public class SwappingTwoVariableWithoutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 30;

		a = a + b; // 20+30=50
		b = a - b; // 50-30=20
		a = a - b; // 50-20=30

		System.out.println(a);
		System.out.println(b);
	}

}
