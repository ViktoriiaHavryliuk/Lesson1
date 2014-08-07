package com.epam.core;

import java.util.Scanner;

public class Task6 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		displayUserInfo();
		sc.close();
	}

	public static String askUserAge() {
		String age;
		while (true) {
			System.out.println("Enter ur age: ");
			age = sc.nextLine();
			try {
				int a = Integer.parseInt(age);
				if (a > 0)
					break;
				else
					System.out.println("Ur age can't be neggative!Enter correct age: ");
			} catch (NumberFormatException ex) {
				System.out.println("Its not a valid Integer");
			}
		}
		return age;
	}

	public static String askUserName() {
		System.out.println("Enter ur name: ");
		String name = sc.nextLine();
		return name;
	}

	public static void displayUserInfo() {
		System.out.println("Ur name: " + capitalLetterToUpperCase() + ". Ur age: "
				+ askUserAge());
	}

	public static String capitalLetterToUpperCase(){
		String userName;
		userName = askUserName().toLowerCase();
		userName = Character.toString(userName.charAt(0)).toUpperCase()+userName.substring(1);
		return userName;
	}
}
