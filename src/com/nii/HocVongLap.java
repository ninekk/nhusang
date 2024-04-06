package com.nii;

public class HocVongLap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		double b = 2;
		
		String volvo = "Volvo";
		String BMW = "BMW";
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
//		System.out.println(cars[0]);
//		System.out.println(cars[1]);
//		System.out.println(cars[2]);
//		System.out.println(cars[3]);

//		for (int i = 0; i < cars.length; i++) {
//			
//			System.out.println(cars[i]);
//		}
		
		int i = 0;
		while (i < cars.length) {
			System.out.println(cars[i]);
			i = i + 1;
		}
		
//		int i = 0;
//		do {
//			System.out.println(cars[i]);
//			i = i + 1;
//		} while (i < cars.length);
			
		
	}

}
