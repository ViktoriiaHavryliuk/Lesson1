package com.epam.core;

import java.util.Arrays;

public class Task13 {

	public static void main(String[] args) {
		int n = (int)(Math.random() * 10);
		String [] array = new String [n];
		fillArray(array, n);
		System.out.println("Original array is: ");
		displayArray(array);
		
		System.out.println("Sorted array is: ");
		Arrays.sort(array);
		displayArray(array);
		
		fillArray(array, n);
		System.out.println("Original array is: ");
		displayArray(array);
		
		System.out.println("Sorted with bubble sort method array is: ");
		sortbubbleSort(array);
		displayArray(array);
		
		System.out.println("New concatenate String: ");
		System.out.println(concatString(array));

	}
	
	public static void fillArray (String[] array, int rnd_size){	
		for (int i=0; i<array.length; i++){
				array[i] = "String number"+(int)(Math.random() * 100);
		}
	}

	public static void sortbubbleSort(String[] array){
		for (int i = array.length-1; i>=0; i--){
			for (int j = 0; j<i; j++){
				if (array[j].compareTo(array[j+1])>0){
					String tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
	}
	
	public static void displayArray(String[] arr){
		System.out.println(Arrays.toString(arr));
	}
	
	public static String concatString (String [] array){
		StringBuilder sb = new StringBuilder();
		for (String lines: array){
		   sb.append(lines);
		}
		return sb.toString();
	}

}
