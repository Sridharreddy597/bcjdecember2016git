package com.bcj.praticeproblems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		System.out.println("enter two Strings");
		Scanner s= new Scanner(System.in);
		
		
		if(isAnagram(s.nextLine(), s.nextLine()))
			System.out.println("anagrams");
		else System.out.println("not anagrams ");
		
	}
	
    static boolean isAnagram(String a, String b) {
       char[] stra=a.replace(" ","").toCharArray();
        char[] strb=b.replace(" ","").toCharArray();
              
        if(stra.length==strb.length)
        {
        	Arrays.sort(stra);
        	Arrays.sort(strb);          
           if(Arrays.equals(stra,strb))
               return true;
            else return false;
            
        }
        else {
            return false;
            
        }
        
        
    }

}
