package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Append {

	public static void main(String[] args) {

		String data = "I am updating the file";
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		File file = new File("G:\\java\\files\\sample.txt");
		
		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			bw.write(data);
			bw.close();
			System.out.println("Data appended succesfully");
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
		
	}

}
