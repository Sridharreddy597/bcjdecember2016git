/**
 * 
 */
package com.bcj.corejava.datatypes.strings.lab4;

/**
 * @author Bootcamp User 005 this class is used to find the sum of the number in
 *         the given array and print the corresponding greater sum of that
 *         element
 */
public class MaxArraySum {

	/**
	 * @param args
	 * 
	 */
	static int counter = 0;
	static String[] numStringArray;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String stringArray = "324, 457, 112, 259, 323, 222";
		numStringArray = stringArray.split(", ");
		int maxElement = 0;
		int[] parsedIntegers = new int[6];
		int[] sumArray = new int[numStringArray.length];

		for (int i = 0; i < 6; i++) {
			parsedIntegers[i] = Integer.parseInt(numStringArray[i]);

			sumArray[i] = sumOfDigits(parsedIntegers[i]);
			maxElement = findMaxOfArray(sumArray[i]);
		}
		findMinMaxIndex(sumArray, maxElement);

	}

	static int maxValue = 0;

	private static int findMaxOfArray(int parseInt) {
		// TODO Auto-generated method stub

		if (parseInt > maxValue)
			maxValue = parseInt;
		else {
		}
		return maxValue;

	}

	/**
	 * @param n
	 * @param maxElement
	 *            this method is used to find the minimum and maximum sum
	 *            element to find the index of given array by takin the max
	 *            element as its parameter
	 */
	private static void findMinMaxIndex(int n[], int maxElement) {
		// for (int i = 0; i < 6; i++)
		// System.out.println(n[i]);
		// TODO Auto-generated method stub
		int index = 0, k = 0;

		// int equalNumbers[] = null;
		System.out.println("the highest sum elements are :");
		while (index < n.length) {
			if ((n[index] > maxElement) || (n[index] == maxElement)) {
				k++;
				System.out.println(numStringArray[index]);

			} else {
			}
			index++;
		}

	}

	private static int sumOfDigits(int numb) {
		int sum = 0, remainder = 0;
		while (numb > 0) {
			remainder = numb % 10;
			sum = sum + remainder;
			numb = numb / 10;
		}
		return sum;
	}

}
