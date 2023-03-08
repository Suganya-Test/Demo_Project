package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseTheStringUsing_Collections {

	public static void main(String[] args) {

		String s = "Java";
		// convert this string into character array
		char[] charArray = s.toCharArray();

		List<Character> c = new ArrayList<>();
		for (Character character : charArray) {

			c.add(character);

		}
		System.out.println(c);
		Collections.reverse(c);
		System.out.println(c);
	}

}
