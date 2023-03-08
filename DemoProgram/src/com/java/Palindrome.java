package com.java;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "Malayalam";
String reverse ="";

for(int i= name.length()-1;i>=0;i--) {
	
	reverse = reverse+name.charAt(i);
}
System.out.println(reverse);
	

	if(name.equalsIgnoreCase(reverse))

	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not a palindrome");
	}
}

}
