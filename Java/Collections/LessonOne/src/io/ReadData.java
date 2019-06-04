package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) {
		
		File file = null;
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		System.out.println("Program started here");
		
		file = new File("G:\\java\\files\\sample.txt"); // file handle location file
		System.out.println("Got the file handle");
		try {			
			 fis = new FileInputStream(file); // input stream channel opened, reading data channel 
			 System.out.println("fis object created");
			 bis = new BufferedInputStream(fis);
			 
			 while(bis.available()>0) {
				 
				 System.out.print((char)bis.read());		
			 }		 		
		} catch (FileNotFoundException e) {
			System.out.println("File not found might be deleted");
			e.printStackTrace();
			
		} catch(IOException e) {
			
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		finally {
			System.out.println("Finally block entered...");
			try {	
				if(bis!=null && fis!=null) {
					bis.close();
					fis.close();
				}
				
			}  catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Program ended here");
		
	}

}
