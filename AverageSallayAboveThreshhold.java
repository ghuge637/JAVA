package hummingbird;

import java.util.Scanner;

public class AverageSallayAboveThreshhold {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double[] salary = new double[n];
		
		System.out.println("Enter the Salary one by one: ");
		for(int i=0; i<n; i++) {
			salary[i]=sc.nextDouble();
		}
		
		System.out.println("Enter the thershHold: ");
		double th = sc.nextDouble();
		
		double total=0; int count=0;
		for(double i: salary) {
			if(i>th) {
				total += i;
				count++;
			}
		}
		
		if(total==0)
			System.out.println("no salary above Thresh hold ");
		else {
			double avg = total/count;
			System.out.println(avg+" : ");
		}
		
	}
}
