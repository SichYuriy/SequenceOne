package com.gmail.at.sichyuriyy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
	
	public static void main(String []args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		FileWriter out = new FileWriter("output.txt");
		String sequence = in.next();
		in.close();
		int maxLength = 0;
		int tempLength = 0;
		for (int i = 0; i < sequence.length(); i++) {
			if(sequence.charAt(i) == '1') {
				tempLength++;
				if(tempLength > maxLength) {
					maxLength = tempLength;
				}
			} else {	
				tempLength = 0;
			}
		}
		out.write(maxLength + "\n");
		out.close();
	}
}
