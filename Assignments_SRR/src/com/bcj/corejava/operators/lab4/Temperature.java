package com.bcj.corejava.operators.lab4;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the celsius temperature ");
		float celsius=s.nextFloat();
		
		celsiusToFahrenheit(celsius);
		System.out.println("enter the fahrenhiet temperture");
		float fahrenhiet=s.nextFloat();
		fahrenheitToCelsius(fahrenhiet);
		s.close();

	}

	private static void fahrenheitToCelsius(float fahrenhiet) {
		// TODO Auto-generated method stub
		float celsius=(fahrenhiet-32)*5/9;
		System.out.println("celsius temperature is "+celsius);
		
	}

	private static void celsiusToFahrenheit(float celsius) {
		// TODO Auto-generated method stub
		float fahrenhiet=(celsius*9/5)+32;
		System.out.println("fahrenhiet temperature is "+fahrenhiet);
	}

}
