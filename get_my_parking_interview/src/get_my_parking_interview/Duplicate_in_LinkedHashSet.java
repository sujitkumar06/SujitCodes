package get_my_parking_interview;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
public class Duplicate_in_LinkedHashSet {
			
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
				
				LinkedHashSet<Product> data = new LinkedHashSet<Product>();
				
				data.add(obj);
				
				data.add(obj1);
				
				data.add(obj2);
				
				
				
				System.out.println(data+"\n");
				
				Iterator<Product> i = data.iterator();
		        while (i.hasNext())
		            System.out.println(i.next());
			}
				

			

			public static void main(String[] args) {
				
				
				Duplicate_in_LinkedHashSet obj = new Duplicate_in_LinkedHashSet();
				
				obj.Duplicate();
				

			}

		}

