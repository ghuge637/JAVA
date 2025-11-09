package hummingbird;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] array = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the array elements: ");
			array[i] = sc.nextInt();
		}
		
		System.out.println("Normal Array display");
		for(int i=0; i<size; i++) {
			System.out.print(" "+array[i]);
		}
		System.out.println(" ");
		
		Arrays.sort(array);
		System.out.println("Sort function Array display");
		for(int i=0; i<size; i++) {
			System.out.print(" "+array[i]);
		}

	}
}
