package extract;

import java.util.HashMap;

public class Hash_Map {
	public static void main(String[]args) {
		
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	map.put(1, "Bangalore");
	map.put(2, "Bangalore");
	map.put(2, "Mumbai");
	map.put(2, "Mumbai");
	map.put(2, "Mumbai");
	map.put(2, "Mumbai");
	map.put(2, "Mumbai");
	map.put(3, "Chennai");
	
	map.get(1);
	map.get(2);
	 //System.out.println(map.get(1));    
	
	   System.out.println("Iterating Hashmap...");  
	   for(HashMap.Entry m : map.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
	   }  
	
	}
}
