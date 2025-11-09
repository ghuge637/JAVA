package hummingbird;
import java.util.Arrays;
import java.util.Scanner;

class MaxNumber{
	
	public static int MaxNum(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int maxSort(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array ");
		int size = sc.nextInt();
		int[] array = new int[size];
		int max = 0;
		for(int i=0; i<size; i++){
			array[i] = sc.nextInt();
		}
		
		System.out.println("Max Number in ARRAY is: " + MaxNum(array));
		System.out.println("Max Number in ARRAY using Sort: " + maxSort(array));

	}
}