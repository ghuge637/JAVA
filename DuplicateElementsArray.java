//4. Write a Java program to find all duplicate elements in an array
package q1to10;

import java.util.Scanner;

public class DuplicateElementsArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int num = sc.nextInt();
		int[] array = new int[num];
		int[] duplicate = new int[num];
		
		for(int i = 0; i<array.length; i++) {
			System.out.print("Enter the Array Element: ");
			array[i]=sc.nextInt();
		}
		
		for(int i=0; i<array.length; i++) {
								int count=0;
								for(int j=0; j<array.length; j++) {
									
									if(array[i]==array[j]) {
										count++;
									}
								}
					//			System.out.println(count);
								
					//			System.out.println(count>=2?array[i]+"Duplicate Number":"");
										if(count>=2) {
											for(int l = 0; l<duplicate.length; l++) 
											{
												if(duplicate[l]==array[i]) {
					//								if(duplicate[l]==0) {
					//									duplicate[l]=array[i];
														break;
					//								}
												}
												else {
													if(duplicate[l]==0) {
														duplicate[l]=array[i];
														break;
													}
												}
											}
										}
		}
		
		int c = 0;
		while(duplicate[c]!= 0) 
		{
			System.out.println("Dublicate Number In array: "+duplicate[c]);
			c++;
		}
	}
}
