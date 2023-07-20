package com.arraySolveExample;

public class Minimum_number {

	static void min_method(int a[]){
		
		int min = a[0];
		for(int i=1; i<a.length; i++) {
			if(min>a[i]) {  
				min = a[i];
			}
		}
		System.out.println(min);
		
	}

	public static void main(String[] args) {

	//	int a[] = {10,22,4,55,77,77,3,6};
		min_method(new int[] {10,22,4,55,77,77,3,6});

	}

}
