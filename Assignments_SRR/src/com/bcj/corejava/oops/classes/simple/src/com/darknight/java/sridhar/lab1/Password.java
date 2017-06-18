package com.darknight.java.sridhar.lab1;

import java.util.Random;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<4;i++)
		{
			sb=sb.append(rndChar());
			sb=sb.append(rndInt());
			
		}
System.out.println("the password is "+sb);
	}
	private static String  rndChar() {
		 Random rand = new Random();
		 int value = 64+rand.nextInt(26);
		 char c=(char)value;	
		 
		return Character.toString(c);
	}
	private static String rndInt()
	{
		Random rand = new Random();
		int value = rand.nextInt(10);
		 return Integer.toString(value);
	}

}
