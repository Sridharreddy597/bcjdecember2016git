/**
 * 
 */
package com.bcj.corejava.operators.lab1;

/**
 * @author Sridhar
 *
 */
public class Investment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int investmentAmount=14000;
		int after1Year=investmentAmount+(investmentAmount*40/100);
		System.out.println("after 1 year with 40% increase in investment it would be "+after1Year);
int after2Years=after1Year-1500;
System.out.println("after 2 years with 1500$ loss in previous investment it would be "+after2Years);
int after3Years=after2Years+(after2Years*12/100);
System.out.println("after 3 years with 12% increase in previous investment it would be "+after3Years);
	}

}
