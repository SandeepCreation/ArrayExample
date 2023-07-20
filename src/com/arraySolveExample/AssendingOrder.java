package com.arraySolveExample;

public class AssendingOrder {

	public static void main(String[] args) {
		int arr[] = { 100, 120, 30, 40, 56 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[0]);
		System.out.println("------------------------------------------");
		for (int k : arr) {
			System.out.println(k);
		}
	}
}
