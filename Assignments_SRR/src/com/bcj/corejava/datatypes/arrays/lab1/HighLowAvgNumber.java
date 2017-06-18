package com.bcj.corejava.datatypes.arrays.lab1;

/**
 * @author Bootcamp User 005
 * this class is defined to print the numbers divisible by 3,print the average of the array
 * print the highest lowest and below average numbers 
 * print the odd numbers  by using methods 
 *
 */
public class HighLowAvgNumber {

	private static int avg;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbersArray = {9, 8, 10, 12, 18, 20, 21, 5, 36, 3};
		numDivisibleBy3(numbersArray);
		
                  printAverage(numbersArray);
                  printHighestLowestBelowAvg(numbersArray);
		getAllOddNumbers(numbersArray);
		
		
			// TODO Auto-generated method stub
			
		
		
	}

	

	/**
	 * @param numbersArray
	 * this method takes the parameter numbersarray and checks each number and 
	 * prints the  highest , lowest and below average numbers 
	 */ 
	private static void printHighestLowestBelowAvg(int[] numbersArray) {
		
		// TODO Auto-generated method stub
		int highest=0;
		// for loop checks the highest number in the array
		for(int i=0;i<numbersArray.length;i++)
		{
			if(numbersArray[i]>highest)
				highest=numbersArray[i];
		}
		System.out.println("higest value in array is :"+highest);
		int lowest=highest;
		//prints the lowest numbers present in the array
		for(int i=0;i<numbersArray.length;i++)
		{
			if(numbersArray[i]<lowest)
				lowest=numbersArray[i];
		}
		System.out.println("lowest value in array is :"+lowest);
		//prints the numbers less than average in the array 
		for(int i=0;i<numbersArray.length;i++)
		{
			if(numbersArray[i]<lowest)
				lowest=numbersArray[i];
		}
		//calulates the numbers lessthan average numbers present in the array and prints them 
		System.out.println(" numbers  lessthan average  in array is :");
		for(int i=0;i<numbersArray.length;i++)
		{
			if(numbersArray[i]<avg)
				System.out.println(numbersArray[i]);
		}
		
		
	}



	/**
	 * @param numbersArray
	 * this method takes the parameter numbersarray as input parameter 
	 * and calculates the average of all the elements in the array 
	 */
	private static void printAverage(int[] numbersArray) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=0;i<numbersArray.length;i++)
		{
			sum=numbersArray[i]+sum;
		}
		avg=sum/10;
		System.out.println("average is :"+avg);
		
	}



	/**
	 * @param numbersArray
	 * this method takes the input parameter number array and 
	 * checks  for each element in the array divisible by 3
	 * and prints them
	 */
	private static void numDivisibleBy3(int[] numbersArray) {
		// TODO Auto-generated method stub		
		System.out.println("numbers divisible by 3 are ");
		for(int i=0;i<numbersArray.length;i++){
		if(numbersArray[i]%3==0)
			System.out.println(numbersArray[i]);			
		}		
	}

	/**
	 * @param numArray
	 * this method takes the input parameter numarray and 
	 * checks  for each element in the array divisible by 2
	 * and prints the odd numbers 
	 */
	
	//getAllOddNumbers(int[] arrayOfNumbers)
	public static int[]  getAllOddNumbers(int[] numArray) {
		int[] oddNumbers=new int[numArray.length];int  k=0; 
		
		
		
		System.out.println("odd numbers are : ");
		
		for(int i=0;i<numArray.length-1;i++)
		{
			if(numArray[i]%2 != 0){
				oddNumbers[k]=numArray[i];
			k++;
			}
			
		}	
		for(int j=0; j<3;j++)
			System.out.println(oddNumbers[j]);
	
			System.out.println("the new array is : ");
		
		for(int i=0;i<numArray.length;i++){
			numArray[i]=numArray[i]+2;
			System.out.println(numArray[i]);
		}
		return oddNumbers;
		
	}

}
