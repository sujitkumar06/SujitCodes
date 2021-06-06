package Collection_Framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
	
     HashMap<String, String> hmap= new HashMap<String, String>();
     hmap.put("1","ONE");
     hmap.put("3","TWO");
     hmap.put("2","THREE");
     
     System.out.println(hmap.get("1"));
     System.out.println((hmap));
     //insertion order is maintained
     LinkedHashMap<String, String> lhmap= new LinkedHashMap<String, String>();
     lhmap.put("1","ONE");
     lhmap.put("3","TWO");
     lhmap.put("2","THREE");
     
     System.out.println(lhmap.get("1"));
     
     System.out.println(lhmap);
     //Sort order is maintained
     TreeMap<String, String> tmap= new TreeMap<String, String>();
     tmap.put("1","ONE");
     tmap.put("3","TWO");
     tmap.put("2","THREE");
     
     System.out.println(tmap.get("1"));
     
     System.out.println(tmap);
	}

}
