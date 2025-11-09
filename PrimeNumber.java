//6. Write a Java program to check if a given number is prime or not
package q1to10;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		System.out.println(num==2||num%2!=0 ?"Prime Number":"Not Prime Number");
	}
}
