package com.bcj.corejava.oops.methodoverloading.lab2;

import java.sql.Date;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=Date.valueOf("1994-07-08");
		
		Employee e1=new Employee("Sridhar");
		Employee e2=new Employee("Sridhar Reddy", "Ramasahayam");
		Employee e3=new Employee("Sridhar Reddy", "Ramasahayam", 12345);
		Employee e4= new Employee("Sridhar Reddy", "Ramasahayam", 1247168, date);
		System.out.println();
		e1.print();
		System.out.println();
		e2.print();
		System.out.println();
		e3.print();
		System.out.println();
		e4.print();
		
	}

}
