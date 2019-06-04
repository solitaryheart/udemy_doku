package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		
		File file = new File("G:\\java\\files\\sample.txt"); // create a handle or reference text file location
		try {
			FileReader fr = new FileReader(file);// File Reader reads character
			BufferedReader br = new BufferedReader(fr);
			
			String str;
			
			try {
				while((str = br.readLine()) !=null){
					System.out.println(str);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		
		} 
		
		

	}

}
