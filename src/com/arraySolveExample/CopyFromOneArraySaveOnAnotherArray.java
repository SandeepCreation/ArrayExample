package com.arraySolveExample;

public class CopyFromOneArraySaveOnAnotherArray {

	public static void main(String[] args) {
		char a[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k' };

		char b[] = new char[5];
		System.arraycopy(a, 2, b, 0, 5);

		System.out.println(String.valueOf(b));

	}

}
