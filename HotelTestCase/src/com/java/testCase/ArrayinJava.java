package com.java.testCase;

import java.util.Scanner;

public class ArrayinJava {
	
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] arr = new int[4];

	        System.out.println("Enter 4 numbers:");

	        for (int i = 0; i < 4; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Sorting in ascending order
	        for (int i = 0; i < 4; i++) {
	            for (int j = i + 1; j < 4; j++) {
	                if (arr[i] > arr[j]) {
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }

	        System.out.println("Array after sorting:");

	        for (int i = 0; i < 4; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}


