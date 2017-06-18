package paperteststring;

import java.util.Scanner;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter any string ");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(str + " => " + getString(str));
	}

	private static String getString(String str) {
		// TODO Auto-generated method stub1
		if(str!=null &&  str!=""){
			str=str.trim();
			 Character ch=str.charAt(0);
			 Integer in= str.length()-2;
			 
			return ch.toString()+in.toString()+str.charAt(str.length()-1);
			
		}
		else

		return "string is null or empty";
	}

}
