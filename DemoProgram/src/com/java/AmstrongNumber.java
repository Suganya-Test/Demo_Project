package com.java;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");

		int rem = 0;
		int temp = 0;
		int num = sc.nextInt();
		int mem = num;

		while (num >= 1) {
			rem = num % 10;
			temp = temp + rem * rem * rem;
			num = num / 10;

		}

		if (mem == temp) {

			System.out.println("Amstrong Number");
		} else {

			System.out.println("Not a Amstrong Number");
		}
	}

}
