package com.bcj.corejava.oops.classes.medium.lab3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Bootcamp User 005
 *this class is defined to get the current system date by using date class
 *and set the values of month day year in the instant variables of mydate class by using setters 
 *and  print the date using getters 
 */
public class DemoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date=new MyDate();
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		//System.out.println(sdf.format(d));
     String[] str=sdf.format(d).split("/");
     date.setMonth(Integer.parseInt(str[0]));
     date.setDay(Integer.parseInt(str[1]));
     date.setYear(Integer.parseInt(str[2]));
     
    
		
		System.out.println(" current date is :"+date.getMonth()+"/"+date.getDay()+"/"+date.getYear());

	}

}
