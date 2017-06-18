package com.bcj.corejava.oops.methodoverloading.lab1;

public class PrintDetails {
	public void printHeader(char c)
	{
		for(int i=0;i<80;i++)
		System.out.print(c);
	}
	public void  printHeader(char c,int no){
		for(int i=0;i<no;i++)
			System.out.print(c);
		
	}
 public void printHeader(String s){
	 System.out.println(s);
	 
 }
}
