//2. Given an array containing n distinct numbers taken from 0, 1, 2, …, n, find the one that is missing from the array
package q1to10;

import java.util.Scanner;

public class Missing_element_q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 'n'th number of array: ");
		int num = sc.nextInt();
		
		if(num <= 1) {
			System.out.println("Array Size is not Valid plz insert greter than 2 size...!!!");
			System.exit(num);
		}
		
		int[] array = new int[num];
		for(int i = 0; i<array.length; i++) {
			System.out.print("Enter the array element: ");
			array[i] = sc.nextInt();
		}
		
//		System.out.println("The Mssing element in Array: "+(array[0+1]));

		for(int i = 0; i<array.length-1; i++) {
			
			if((array.length-1) != i) {
				
				if((array[i]+1) != (array[i+1])) {  //Given function check the current number+1 is equal to i+1 index location number in the array
					
					System.out.println("The Mssing element in Array: "+(array[i]+1));
					
					// Given Function is use then we want find continuse missing number in array
//					int count = 1;
//					while((array[i]+count) != (array[i+1])) {   // This function use for pritn continuse missing number in the array
//						System.out.println((array[i]+count));
//						count++;
//					}
					
				}
				
			}
		}
	}
}
