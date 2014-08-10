package com.epam.core;

/**
 * @author Viktoriia Havryliuk
 *
 */
public class Task8 {

	public static void main(String[] args) {
		System.out.println(comparePairs(177777, 177777));
		System.out.println(comparePairs("nwewdLine", "secondLine"));
		System.out.println(comparePairs('a', 'f'));

	}

	//method returns max int from pair of int numbers, in case they are equals return 0
	public static int comparePairs (int firstNum, int secondNum){
		if (firstNum == secondNum) return 0;
		if (firstNum > secondNum) return firstNum;
		else return secondNum;
	}
	//method returns max String from pair of Strings, in case they are equals return message
	public static String comparePairs(String firstLine, String secondLine) {
		if (firstLine.equalsIgnoreCase(secondLine)) return "Two lines are equals!";
		if (firstLine.compareTo(secondLine)>0) return firstLine;
		else return secondLine;
	}
	//method returns max char from pair of chars, in case they are equals return default value
	public static char comparePairs (char firstChar, char secondChar){
		if (firstChar==secondChar) return '\u0000';
		if (firstChar > secondChar) return firstChar;
		else return secondChar;
	}
}
