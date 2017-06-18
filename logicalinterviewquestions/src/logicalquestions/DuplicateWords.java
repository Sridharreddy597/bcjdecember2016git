package logicalquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWords {

	public static void main(String[] args) {
		
		System.out.println("enter the Stirng in the form of lines");
		
		Scanner sc =new Scanner(System.in);
	
		String stringwords[]= sc.nextLine().split(" ");
		Map<String,Integer> countStrings = new HashMap<String,Integer>();
		for(int i=0; i<stringwords.length;i++){
			if(countStrings.containsKey(stringwords[i])){
				countStrings.put(stringwords[i], countStrings.get(stringwords[i])+1);
			}
		else{
			countStrings.put(stringwords[i],1);
		}
			
		
		}
		for (String stringkey : countStrings.keySet()) {
		    System.out.println( stringkey +":"+ countStrings.get(stringkey));
		}

		//System.out.println(countStrings.entrySet());
	}

}
