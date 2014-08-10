package com.epam.core;

public class Task11 {

	public static void main(String[] args) {
		forLoop(100);
		whileLoop(100);
		doWhileLoop(100);

	}

	public static void forLoop (int numberToPrint){
		for (int i = 0; i <= numberToPrint; i++){
			System.out.print(i+" ");	
		}
		System.out.println();
	}
	
	public static void whileLoop (int numberToPrint){
		int i = 0;
		while (i <= numberToPrint){
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
	}
	
	public static void doWhileLoop (int numberToPrint){
		int i = 0;
		do {
			System.out.print(i+ " ");
			i++;
		} while (i <= numberToPrint);
		System.out.println();
	}
}
