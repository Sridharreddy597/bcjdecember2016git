package logicalquestions;

import java.util.HashMap;
import java.util.Map;

public class ArrayPairSumUsingMap {

	public static void main(String[] args) {

		int[] a = { 2, 45, 7, 3, 5, 1, 8, 9 };
		printSumPairs(a, 10);

	}

	public static boolean printSumPairs(int[] input, int k) {
		boolean status=false;
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

		for (int i = 0; i < input.length; i++) {

			if (pairs.containsKey(input[i])){
				System.out.println(input[i] + ", " + pairs.get(input[i]));
			status=true;
			break;
			}
			else{
				pairs.put(k - input[i], input[i]);
			status =false;
			
			}
		}
		return status;

	}
}