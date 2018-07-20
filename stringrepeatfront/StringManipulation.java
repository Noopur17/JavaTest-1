package com.marlabs.stringrepeatfront;

import java.util.Scanner;

public class StringManipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.next();

		System.out.println("Enter the number of character:");
		int n = sc.nextInt();

		System.out.println("The string you want to manipulate is   :" + str);
		System.out.println("The number of characters you want to manipulate  :" + n);
		StringManipulation sm1 = new StringManipulation();
		sm1.repeatFront(str, n);

	}

	public String repeatFront(String str, int n) {

		int len = str.length();

		String newWord = "";

		for (int i = n; n > 0; n--) {

			newWord = newWord + str.substring(0, n);

		}
		System.out.println(newWord);
		return newWord;

	}

}
