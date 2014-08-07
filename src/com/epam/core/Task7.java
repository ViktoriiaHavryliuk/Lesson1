package com.epam.core;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

public class Task7 {

	public static void main(String[] args) {
		readPropertyFile();
		displayUserInfo();
	}

	public static String readAgeFromProperties(){
		return System.getProperty("data.age");
	}

	public static String readNameFromProperties(){
		return System.getProperty("data.name");
	}

	public static void readPropertyFile(){
		//  Read data from property file
		Properties prop = new Properties();
		try {
			File file = new File("data.properties");
			FileInputStream fis = new FileInputStream(file.getAbsolutePath());
			prop.load(fis);
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		@SuppressWarnings("unchecked")
		Enumeration<String> e = (Enumeration<String>) prop.propertyNames();
		while (e.hasMoreElements()) {
			String key = e.nextElement();
			System.setProperty(key, prop.getProperty(key));
		}
	}

	public static void displayUserInfo() {
		System.out.println("Your name: " + capitalLetterToUpperCase() +"\nYour age: "
				+ readAgeFromProperties());
	}
	
	public static String capitalLetterToUpperCase(){
		String userName;
		userName = readNameFromProperties().toLowerCase();
		userName = Character.toString(userName.charAt(0)).toUpperCase()+userName.substring(1);
		return userName;
	}

}
