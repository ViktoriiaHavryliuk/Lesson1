package com.epam.core;

import java.util.Arrays;

public class Task15 {

	public static void main(String[] args) {
		int numOfrows = (int)(Math.random() * 10);
		int [][] arr = new int [numOfrows][numOfrows];
		fillArray(arr);
		System.out.println("Original matrix:");
		displayArray(arr);
		System.out.println();
		transposeMatrix(arr);
		System.out.println("Sorted matrix:");
		displayArray(arr);

	}

	public static void fillArray(int[][] arr){
		for (int i = 0; i< arr.length; i++){
			for (int j = 0; j< arr.length; j++){
				arr[i][j] = (int)(Math.random()*100);	
			}	
		}
	}

	public static void displayArray(int[][] arr){
		for (int[] a: arr){
			System.out.println(Arrays.toString(a));
		}
	}

	public static void transposeMatrix(int[][] arr){
		for (int i =0; i<arr.length; i++){
			for (int j=i+1; j<arr.length; j++){
				int tmp = arr[i][j];
				arr[i][j] = arr [j][i];
				arr [j][i] = tmp;
			}
			
		}
	}
}
