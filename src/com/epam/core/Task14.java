package com.epam.core;

import java.util.Arrays;

public class Task14 {

	public static void main(String[] args) {
		int sizeOfRows = (int)(Math.random()*10);
		int sizeOfColumn = (int)(Math.random()*10);
		double [][] array = new double [sizeOfRows][sizeOfColumn];
		fillArray(array);
		displayArray(array);
		System.out.println(sum(array));
		displayArray(createRaggedArray());
		System.out.println(isArrayRagged(createRaggedArray()));
		System.out.println(isArrayRagged(array));
	}

	public static void fillArray(double[][] array){
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j<array.length;j++){
				array[i][j] = (double)(Math.random()*5);
			}
		}
	}

	public static void displayArray (double[][] array){
		for (double[] a: array){
			System.out.println(Arrays.toString(a));
		}
	}

	public static double sum(double[][] array){
		double sum = 0;
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j<array.length;j++){
				sum +=array[i][j];
			}
		}
		return sum;
	}

	public static double[][] createRaggedArray(){
		double[][] array;
		array = new double[5][]; // allocate array of rows
		for (int r=0; r<array.length; r++) {
			array[r] = new double [r+1];
		} 
		return array;
	}
	
	public static boolean isArrayRagged(double[][] array) {
		for (int i = 1; i < array.length;i++){
			if (array[i].length != array[0].length) return true;	
		}
		return false;		
	}

}
