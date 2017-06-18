package com.bcj.logicalinterviewquestions.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIteration {

	public static void main(String[] args) {		
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1,"sridhar");
		map.put(2, "reddy");
		map.put(3, "shahidhar");
		map.put(4, "srimathi");
		map.put(5, "ravidhar");
		map.put(6, "sunitha ");
		map.put(7, "surendhar");
		map.put(8, "prudhvi");
		map.put(9,"anil");
		map.put(10, "hema");
		Set<Map.Entry<Integer,String>> set=map.entrySet();  
		  
		Iterator<Map.Entry<Integer,String>> itr=set.iterator();  
		while(itr.hasNext()){  
		Map.Entry e=itr.next();//no need to typecast  
		System.out.println(e.getKey()+" "+e.getValue());  
		
		/*for(Map.Entry<Integer, String> entry : map.entrySet()){
			System.out.println(entry.getKey()+ "   "+ entry.getValue());
		}*/
		
		
		
		}
	}
}
