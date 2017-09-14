
package logicalquestions;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicatesRemoval {
	 
	 public static void main(String[] args) {
		 System.out.println("enter the Stirng in the form of lines");
			
			Scanner sc =new Scanner(System.in);
		
			String stringwords= sc.nextLine();
			Set<Character> countStrings = new LinkedHashSet<Character>();
			for(int i=0;i<stringwords.length();i++){
				countStrings.add(stringwords.charAt(i));	
			}
			for(Character c:countStrings){
				System.out.print(c);
					
			}
		
			
			
	 }
}
