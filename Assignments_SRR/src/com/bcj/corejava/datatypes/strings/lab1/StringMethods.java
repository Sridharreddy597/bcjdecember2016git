package com.bcj.corejava.datatypes.strings.lab1;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="hello how are you?";
		int count=0;
		//counts the number of words
		String[] str=st.split(" ");
		for(int i=0;i<str.length;i++)
		{
			count++;
		}		
			System.out.println("no of words in the string is " +count);	
			
			/*prints the length of given string*/
		System.out.println("length of string is "+st.length());
		
		
		
		/*replaces hello with HELLO in the above string*/
		System.out.println(st.replaceAll("hello", "HELLO"));
		
		
		
		/* replaces space with comma in the above string */
		
		System.out.println(st.replaceAll(" ", ","));
		
		
		
		/*prints the first 3 characters from the give above string*/
		
		System.out.print("the first 3 characters are : ");		
		for(int i=0;i<3;i++)
		System.out.print(st.charAt(i));
		System.out.println();
		
		/*compares the string hello and HEllO and returns boolean*/
		
		System.out.println("comparing the strings hello and HELLO returns:"+str[0].equals("HELLO"));
		
		
		
		/*takes the word NITIN into StringBuffer object and 
		 check the string is same from both sides and prints the statement accordingly*/
		
		StringBuffer sb=new StringBuffer("NITIN");
		StringBuffer sbreverse=sb.reverse();
		if(sbreverse.equals(sb))
		System.out.println("the string NITIN is same from both sides ");
		
		 
		
		/*find the character A from the given string and 
		 prints the number of occurrences and their indexes */
		
		 String strFindA= "HELLO HOW ARE YOU AND WHERE ARE YOU";
		 System.out.println("the indexes where A is present at: ");
		 int counter=0;
		 for(int index=0;index<strFindA.length();index++)
			 
		 {
			if(strFindA.charAt(index)=='A'){				
				System.out.println(index);
			       counter++;
			}
		 }
		 System.out.println("the total no of occurences of A in the above string is :"+counter);
		 
		 
		 
	/*This line checks for the word institute and 
	 * replaces the word with JSStitute and prints it*/
		 
		 String strng ="This is a java institute of insurance and insu.";
		 System.out.println(strng.replaceAll("institute", "JSStitute"));
		   
		    
		

	}


}
