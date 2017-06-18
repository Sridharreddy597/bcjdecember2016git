package com.bcj.corejava.datatypes.arrays.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bcj.corejava.datatypes.arrays.lab1.HighLowAvgNumber;

public class TestOddNumbers {
	@Test
	public void TestOddNumbers() {
		 int a[] = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		 int b[]={9,21,5,3,0,0,0,0,0,0};
		 HighLowAvgNumber hla = new HighLowAvgNumber();
		assertArrayEquals(hla.getAllOddNumbers(a),b);
	}

}
