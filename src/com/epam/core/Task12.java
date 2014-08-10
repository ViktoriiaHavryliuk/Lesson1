package com.epam.core;

public class Task12 {

	public static void main(String[] args) {
		System.out.println(forLoop(100,500));
		System.out.println(whileLoop(100,500));
		System.out.println(doWhileLoop(100,500));

	}

	public static int forLoop (int startNum, int endNum){
		int sum = 0;
		for (int i = startNum+1; i <= endNum; i +=2){
			sum +=i;	
		}
		return sum;
	}
	
	public static int whileLoop (int startNum, int endNum){
		int sum = 0;
		int i = startNum+1;
		while (i <= endNum){
			sum +=i;
			i +=2;
		}
		return sum;
	}
	
	public static int doWhileLoop (int startNum, int endNum){
		int sum = 0;
		int i = startNum+1;
		do {
			sum +=i;
			i +=2;
		} while (i <= endNum);
		return sum;
	}
}
