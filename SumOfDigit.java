package hummingbird;

import java.util.Scanner;

//Sum of Digits of a Number

public class SumOfDigit {
	public static int sum(int num) {
		int sum =0;
		while(num>0) {
			int dig = num%10;
			sum += dig;
			num /= 10;
		}
		return sum;
	}
	
	public static int rec_sum(int num) {
		if(num==0)
			return 0;
		return (num%10+rec_sum(num/10));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("Sum of number digits are: "+sum(number));
		System.out.println("using recursion function Sum of number digits are: "+rec_sum(number));
		
	}
}
