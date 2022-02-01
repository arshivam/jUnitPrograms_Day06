package com.bridgelabz.junitprograms;
import java.util.*;

public class monthlyPayment {
	public static void main(String[] args) {
		System.out.println("Enter the Principal amount:");
		Scanner sc = new Scanner(System.in);
		double P = sc.nextDouble();
		
		System.out.println("Enter the rate :");
		double R = sc.nextDouble();
		double r = R/(12*100);
		
		System.out.print("Enter Time period in years : ");
		double Y =sc.nextDouble();
        double n = 12*Y;
        
        double payment =(P*r) / (1 - Math.pow(1+r,-n));
        
        System.out.println("Payment: " +payment);
	}
}
