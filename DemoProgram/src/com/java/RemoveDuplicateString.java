package com.java;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "java", "c", "C++", "python", "java" };

		Set<String> s = new LinkedHashSet<>();

		for (String st : str) {

			s.add(st);
		}
		System.out.println(s);
	}

}
