package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class NewFile {

	public static void main(String[] args) {
				
		
		FileOutputStream fos = null;
		String str = "This is my first line";
		
		byte[] content = str.getBytes();
		
		File file = new File("G:\\java\\files\\sample.txt");
		
															
		try {
			
			fos = new FileOutputStream(file);
			fos.write(content);
			fos.flush();
			
		} catch (IOException e) {
			
			e.printStackTrace();	
			
		} 
	
		
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
