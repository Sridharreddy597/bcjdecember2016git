package com.bcj.logicalinterviewquestions;

public class IncreasingSequence {

	public static void main(String[] args) {
		
		for(int i=100;i<1000;i++){
				int j=i%10;
				int k=(i/10)%10;
				int l=i/100;
				if(k<j&&l< k)
					System.out.println(i);
				
		
		}	
	}
}

	
	
	

