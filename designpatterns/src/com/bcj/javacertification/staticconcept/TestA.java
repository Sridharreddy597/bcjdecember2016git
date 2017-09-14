package com.bcj.javacertification.staticconcept;

 class Alpha {
	public Alpha(int ns) {
		//System.out.println("%%%%ns is "+ns+"   s="+s);
		if(s<ns){
			s=ns;
			this.ns=ns;
		}
		//System.out.println("%%%%ns is "+ns+"   s="+s);
	}
	
	int ns;
	static int  s;
	void doPrint (){
		System.out.println("ns is "+ns+"   s="+s);
		
	}
	
}

 class TestA{
	public static void main(String[] args) {
		Alpha dfg= new Alpha(123);
		Alpha dfg1= new Alpha(12893);
		Alpha dfg2= new Alpha(12);
		
		dfg.doPrint();
		dfg1.doPrint();
		dfg2.doPrint();
	//	System.out.println(dfg.ns);
		//System.out.println();
	}
	
}
