package com.bcj.logicalinterviewquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class LengthEncoding {

	public static void main(String[] args) {
		
		Scanner sc= new  Scanner(System.in);
		char ch[]=sc.nextLine().toCharArray();
		int count =1;
	
		Map<Character,Integer> charactercount= new HashMap<Character,Integer>();
		
		for(int i=0;i<ch.length;i++){
			
			if(charactercount.containsKey(ch[i])){
				charactercount.put(ch[i], charactercount.get(ch[i])+1);
				
				//aaaaaaaaSystem.out.println(ch[i]);
			}
			else{
				charactercount.put(ch[i], count);
			}
		}
		for(Entry<Character, Integer> c : charactercount.entrySet()){
			System.out.print(c.getKey() + ""+c.getValue());
		}
			
			
		}

		
		
		
		
		
	}


