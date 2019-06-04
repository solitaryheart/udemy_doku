package pack;

import java.util.ArrayList;

public class ArrList {
	
	// List of names; 

	public static void main(String[] args) {
		//int number = 10;
		//System.out.println(number);
		ArrayList<Integer> alist = new ArrayList<Integer>(); // creating emty array list
		alist.add(33); // adds first item 33 to alist
		alist.add(68);
		alist.add(75);
		alist.add(54);
		alist.add(62);
		alist.add(23);
		alist.add(543);
		alist.add(667);
		alist.add(89);
		alist.add(95);
		alist.add(100);
		
		//alist.add(3, 999);
		//alist.remove(7);
		//System.out.println(alist.size());
		//System.out.println(alist);
		
		//System.out.println(alist.get(1));
		
		for(int temp :alist) {
			System.out.println("items :" + temp);
			
		}
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		

	}

}
