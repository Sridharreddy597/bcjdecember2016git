package com.bcj.corejava.exceptionhandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TransformAndCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			transformAndCopyFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void transformAndCopyFile() throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("f:\\read.txt");
		BufferedReader br = new BufferedReader(fr);

		String totalContent = "";
		String line = null;
		while ((line = br.readLine()) != null) {
			if (!(line.length() == 0) && !line.contains("//")) {

				totalContent = totalContent + line + "\r\n";
			}

		}
		System.out.println(totalContent);

		PrintWriter pw = new PrintWriter(new FileWriter("f:\\out.txt"));
		pw.write(totalContent);
		pw.close();
	}
}