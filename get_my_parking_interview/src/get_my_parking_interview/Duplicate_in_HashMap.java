package get_my_parking_interview;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_in_HashMap {
	
	public void Duplicate() {
		
		Product obj = new Product();
		Product obj1 = new Product();
		Product obj2 = new Product();
		
		obj.setName("Sujit");
		obj.setPrice(100);
		obj.setWeight(200);
		
		obj1.setName("Sujit");
		obj1.setPrice(100);
		obj1.setWeight(100);
		
		obj2.setName("Sujit");
		obj2.setPrice(100);
		obj2.setWeight(200);
		
		HashMap<Product, Integer> data = new HashMap<Product,Integer>();
		
		data.put(obj, 1);
		
		data.put(obj1, 1);
		
		data.put(obj2, 1);
		
		
		
		System.out.println(data+"\n");
		System.out.println(data.entrySet());
		
	  for (Map.Entry<Product, Integer> entry :data.entrySet()) 
		   
		  {
	           System.out.println(entry.getKey() + "=>"  + entry.getValue());
	        }
	}
	

	public static void main(String[] args) {
		
		
		Duplicate_in_HashMap obj = new Duplicate_in_HashMap();
		
		obj.Duplicate();
		

	}

}
