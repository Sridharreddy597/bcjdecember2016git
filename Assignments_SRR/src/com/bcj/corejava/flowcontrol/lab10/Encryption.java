/**
 * 
 */
package com.bcj.corejava.flowcontrol.lab10;

import java.util.Scanner;

/**
 * @author sridhar
 *
 */
public class Encryption {
	static int quotient[];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter any 4-digit integer");
		int data=s.nextInt();
		
		int[] encryptedData=encrypt(data);
		System.out.println();
		decrypt(encryptedData);
		s.close();
		
	}
	private static void decrypt(int[] encryptedData) {
		// TODO Auto-generated method stub
		int temp= encryptedData[2];
		encryptedData[2]=encryptedData[0];
		encryptedData[0]=temp;
		int  temp2=encryptedData[1];
		encryptedData[1]=encryptedData[3];
		encryptedData[3]=temp2;
		System.out.println("decrypted data is : ");
		for(int i=0;i<4;i++){
		if(encryptedData[i]<=6)		
			encryptedData[i]=(encryptedData[i]+10);
			
		encryptedData[i]=	encryptedData[i]-7;
		System.out.print(encryptedData[i]);
		
		
		
		}
		
		
	}
	private static int[] encrypt(int  data) {
		// TODO Auto-generated method stub
		int rem[] = new int[4];
		int i;int newArray[]=new int[4];
	 
		System.out.println("encrypted data is : ");
		 
		for( i = 3; i >=0 ; i--)
		{
			int remainder=0;
			remainder=data%10;
			
			data=data/10;
			rem[i]=remainder;		
			newArray[i]=(remainder+7)%10;
			
			
			
		}
		//System.out.println();
		
		int temp=newArray[2];
		newArray[2]=newArray[0];
		newArray[0]=temp;
		int temp2=newArray[1];
		newArray[1]=newArray[3];
		newArray[3]=temp2;
		for(int  j= 0; j<4 ; j++)
		System.out.print(newArray[j]);
		
		
		return newArray;
	}
	
	
}
