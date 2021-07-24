package hashMap_reverse;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Hash_map_reverse {
	public Hash_map_reverse(){
	//Map<String, Integer> map1= new HashMap<String, Integer>();
//	map1.put("Sujit", 1);
//	map1.put("AMIT", 2);
	
	//for(Map.Entry<String, Integer> entry: map1.entrySet())
	//	System.out.println("Key: "+entry.getKey()+" VAlue: "+entry.getValue());
	
	//using forEach()
	
	//map1.forEach((k,v)->System.out.println("KEy: "+k+ "VAlue:"+v));
	
	
	 HashMap<Integer, String> s = new HashMap<Integer, String>();

     s.put(4, "Value1");
     s.put(5, "Value2");

     for (Map.Entry<Integer, String> en : s.entrySet()) {
         System.out.println(en.getKey() + " " + en.getValue());
     }

     /*
      * swap goes here
      */
     HashMap<String, Integer> newMap = new HashMap<String, Integer>();
     for(Map.Entry<Integer, String> entry: s.entrySet()){
         newMap.put(entry.getValue(), entry.getKey());
     }

     for(Map.Entry<String, Integer> entry: newMap.entrySet()){
         System.out.println(entry.getKey() + " " + entry.getValue());
     }
     /*
      * using java 8
      */
     Map<String,Integer> J8hashmap= 
    		    s.entrySet().stream()
    		                .collect(Collectors.toMap(Map.Entry::getValue,Map.Entry::getKey));
     
     J8hashmap.forEach((k,v)->System.out.println("Key: "+ k+ "VAlue: "+ v));
 }
	
	public static void main(String args[]) {
		Hash_map_reverse obj = new Hash_map_reverse();
	}

}
