package logicalquestions;

import java.util.Arrays;

public class AnagramDemo {
	static String s1 = "asdf";
	static String s2 = "asfkd";

	public static void main(String[] args) {

		if (isAnagram(s1, s2)) {
			System.out.println("anagrams ");
		}
		else  System.out.println(" not anagrams ");
	}

	private static boolean isAnagram(String s1, String s2) {
		boolean status = false;
		if (s1 != null && s2 != null) {

			char removewhitespaces1[] = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
			char removewhitespaces2[] = s2.replaceAll("\\s", "").toLowerCase().toCharArray();

			if (removewhitespaces1.length != removewhitespaces2.length) {
				status = false;
			} else {
				Arrays.sort(removewhitespaces1);
				Arrays.sort(removewhitespaces2);

				status = Arrays.equals(removewhitespaces1, removewhitespaces2);
			}
			return status;
		}

		else {
			System.out.println(" strings are null ");
		}
		return status;
	}
}
