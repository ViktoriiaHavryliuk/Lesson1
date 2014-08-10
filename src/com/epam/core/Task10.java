package com.epam.core;

import java.util.Hashtable;

/**
 * @author Viktoriia Havryliuk
 *
 */
public class Task10 {

	public static void main(String[] args) {
		defineSeason("January");
		defineSeason("April");
		defineSeason("August");
		defineSeason("October");
	}

	public static void defineSeason(String month){
		Hashtable<String, Integer> months = new Hashtable<>();
		months.put("January", 1);
		months.put("February", 2);
		months.put("March", 3);
		months.put("April", 4);
		months.put("May", 5);
		months.put("June", 6);
		months.put("July", 7);
		months.put("August", 8);
		months.put("September", 9);
		months.put("October", 10);
		months.put("November", 11);
		months.put("December", 12);

		switch (months.get(month))
		{
		case 1: {
			System.out.println("Winter");
			break;
		}
		case 2: {
			System.out.println("Winter");
			break;
		}
		case 3: {
			System.out.println("Spring");
			break;
		}
		case 4: {
			System.out.println("Spring");
			break;
		}
		case 5: {
			System.out.println("Spring");
			break;
		}
		case 6: {
			System.out.println("Summer");
			break;
		}
		case 7: {
			System.out.println("Summer");
			break;
		}
		case 8: {
			System.out.println("Summer");
			break;
		}
		case 9: {
			System.out.println("Autumn");
			break;
		}
		case 10: {
			System.out.println("Autumn");
			break;
		}
		case 11: {
			System.out.println("Autumn");
			break;
		}
		case 12: {
			System.out.println("Winter");
			break;
		}
		default: {
			System.out.println("Invalid input.");
			break;
		}
		}
	}
}
