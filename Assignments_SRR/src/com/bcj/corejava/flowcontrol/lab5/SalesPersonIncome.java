/**
 * 
 */
package com.bcj.corejava.flowcontrol.lab5;

import java.util.Scanner;

/**
 * @author Bootcamp User 005
 *
 */
public class SalesPersonIncome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter the no of items sold by sales person");
		int noOfItems=s.nextInt();
		System.out.println("enter the "+noOfItems+" items numbers between 1 and 4");
		s.close();
		int items[] = new int[noOfItems];
		
		double grossSales=0;
		for(int i=0;i<noOfItems;i++)
		{
			items[i]=s.nextInt();
		}
		for(int i=0;i<noOfItems;i++)
		{
			if(items[i]==1)			
				grossSales=grossSales+239.99;
			
			else if (items[i]==2)
				grossSales=grossSales+129.75;
			else if(items[i]==3)
				grossSales=grossSales+99.95;
			else if(items[i]==4)
				grossSales=grossSales+350.89;
			else grossSales=grossSales+0;
			
			}
		
		System.out.println("The total earnings of sales person is : "+(grossSales*0.09+200));
	}

}
