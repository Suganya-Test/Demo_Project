package com.java;

public class RemoveDuplicate_InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = { "java", "c", "C++", "python", "java" };

		for (int i = 0; i < s.length; i++) {

			for (int j = i + 1; j < s.length; j++) {

				if (s[i] . equalsIgnoreCase(s[j])) {
					
					System.out.println(s[i]);
				}
			}
		}
	}

}
