package com.java;

import java.util.ArrayList;


public class RemoveDuplicate_UsingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>();

		a.add(10);
		a.add(8);
		a.add(15);
		a.add(28);
		a.add(35);
		a.add(50);
		a.add(35);
		a.add(40);
		a.add(15);
		System.out.println(a);

		int length = a.size();
		System.out.println(length);

		for (int i = 0; i < length; i++) {

			for (int j = i + 1; j < length; j++) {

				if (a.get(i) == a.get(j)) {

					a.remove(i);
					i = 0;
					j = 0;
					length = length - 1;

				}

			}

		}
		System.out.println(a);
	}

}
