package com.java;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Suganya";
		
		String reverse = "";
		
		for (int i = name.length()-1; i>=0; i--) {
			
			reverse = reverse + name.charAt(i);
			
		}
		System.out.println(reverse);
			
		}

}
