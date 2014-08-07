package com.epam.core;

import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) {
	System.out.println(concat("Nastya","Ostapova"));
	System.out.println(getSymbolByIndex("My new favorite game"));
	System.out.println(compare("Vika","Havryliuk"));
	System.out.println(stringToSubstring("World", "orl"));
	System.out.println(stringStartsWithSubString("MyFavorite poem", "My"));
	System.out.println(isEqualsToAnotherString("New word","another new word"));
	System.out.println(isStringEmpty(""));
	System.out.println(checkLengthOfString("New world!"));
	System.out.println(weatherStringMatchRegularExp("New Year Eve", ".*New.*"));
	System.out.println(replaceSubstringWithAnotherString("Summertime sadness", ".*time.*", "holiday"));
	System.out.println(Arrays.toString(splitStringByDelimeter("My favorite game, newgame!", ",")));
	System.out.println(getSubStringByStartEndIndex("Hello my dear world!",2,14));
	System.out.println(Arrays.toString(getCharArrayFromString("new happy world")));
	System.out.println(convertToUpperCase("New happy world!"));
	System.out.println(convertToLowerCase("NEW happy World!"));
	System.out.println(trimTheString("          New happy world!"));
	System.out.println(convertIntIntiString(158));
	formatStringWithReplacingMarkersByValues();
	}
	
	public static String concat(String firstNewLine, String secondNewLine){
		StringBuilder sb = new StringBuilder();
		sb.append(firstNewLine);
		sb.append(" ");
		sb.append(secondNewLine);
		return sb.toString();	
	}
	
	public static char getSymbolByIndex (String line){
		return line.charAt(5);
	}
	
	public static int compare(String firstNewLine, String secondNewLine){
		return firstNewLine.compareTo(secondNewLine);	
	}

	public static boolean stringToSubstring (String firstNewLine, String subString){
		return firstNewLine.contains(subString);
	}
	
	public static boolean stringStartsWithSubString (String firstNewLine, String subString){		
		return firstNewLine.startsWith(subString)||firstNewLine.endsWith(subString);
	}
	
	public static boolean isStringEmpty (String firstNewLine){
		return firstNewLine.isEmpty();
	}
	
	public static boolean isEqualsToAnotherString (String firstNewLine, String secondLine){
		return firstNewLine.equalsIgnoreCase(secondLine);
	}
	
	public static int checkLengthOfString(String firstNewLine){
		return firstNewLine.length();
	}
	
	public static boolean weatherStringMatchRegularExp (String firstNewLine, String regex){
		return firstNewLine.matches(regex);
	}
	
	public static String replaceSubstringWithAnotherString (String firstLine, String regex, String secondLine){
		return firstLine.replaceFirst(regex, secondLine);
	}
	
	public static String[] splitStringByDelimeter (String firstLine, String regex){
		return firstLine.split(regex);
	}
	
	public static String getSubStringByStartEndIndex(String firstLine, int beginIndex, int endIndex){
		return firstLine.substring(beginIndex, endIndex);
	}
	
	public static char[] getCharArrayFromString(String firstLine){
		return firstLine.toCharArray();
	}
	
	public static String convertToUpperCase(String firstLine){
		return firstLine.toUpperCase();
	}
	
	public static String convertToLowerCase(String firstLine){
		return firstLine.toLowerCase();
	}
	
	public static String trimTheString (String line){
		return line.trim();
	}
	
	public static void formatStringWithReplacingMarkersByValues(){
		
	}
	
	public static String convertIntIntiString (int var){
		return String.valueOf(var);
	}
}
