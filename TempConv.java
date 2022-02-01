package com.bridgelabz.junitprograms;
import java.util.*;

public class TempConv {
	double Celsius(double Farhenite) {
		return (Farhenite - 32)*5/9;	
	}
	double Farhenite(double Celsius) {
		return (Celsius * 9/5)+32;
	}

	public static void main(String[] args) {
		int ch;
		double Celsius;
		double Farhenite;
		System.out.println("Enter the Type of Conversion");
		System.out.println("Press '1' Farhenite to celsius");
		System.out.println("Press '2' Celsius to Farhenite");
		
		Scanner sc = new Scanner(System.in);
		ch=sc.nextInt();
		
		switch(ch) {
		case 1:System.out.println("Enter Temperature in Celsius");
		Celsius = sc.nextDouble();
		TempConv farh = new TempConv();
		double result1 = farh.Farhenite(Celsius);
		System.out.println("Temperature in Farhenite= "+result1);
		break;

		case 2: System.out.println("Enter Temperature in Farhenite");
		Farhenite = sc.nextDouble();
		TempConv cel = new TempConv();
		double result2=cel.Celsius(Farhenite);
		System.out.println("Temperature in Celsius = " +result2);
		break;

		default: System.out.println("Enter valid choice");
		}

	}
}
