package pack;

import java.util.ArrayList;

public class LearningMap {

	public static void main(String[] args) {

		
		 java.util.HashMap<String, String> hmap = new java.util.HashMap<String, String>(); // HashMap declaration
		
			hmap.put("US57", "Olivia"); // added first pair to hashmap
			hmap.put("US99", "Ruby");
			hmap.put("US78", "Emily");
			hmap.put("US51", "Grace");
			hmap.put("US89", "Jessica");
			hmap.put("US90", "Ruby");
			
			//System.out.println(hmap);
			//System.out.println(hmap.get("US78"));
			
			//hmap.forEach((key,value)-> System.out.println(key + "-" + value));
			
			hmap.forEach((key,value)-> System.out.println(key+":-"+value));
			
			
			
			
			
			
			
			
		
		
		
		
		
	}

}
