package Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List {

	public static void main(String[] args) {

   ArrayList<String> Arr_list= new ArrayList<String>();
  //  List<String> Arr_list= Arrays.asList("Sujit");
   Arr_list.add("Sujit");
   Arr_list.add("Ajit");
    Arr_list.add("Amit");
   Arr_list.add("Rohit");
    Arr_list.add("Sujit");
    
    LinkedList<String> Linked_list= new LinkedList<String>();
    Linked_list.add("MAthew");
    Linked_list.add("sebastiona");
    Linked_list.addLast("Sjj");
    System.out.println("get first: "+Linked_list.getFirst());
    System.out.println("removed "+Linked_list.remove("Sjj"));
    Collections.sort(Arr_list);
    
    for(String str: Arr_list)
    System.out.println(str);
    
    int index=Collections.binarySearch(Arr_list, "Sujit");

    System.out.println("Sujit present at index: "+(index+1));
    
    String max=Collections.max(Arr_list);
    
    System.out.println("Max element: "+max);
    
    String min=Collections.min(Arr_list);
    
    System.out.println("Min element: "+min);
    
   Collection<String> Synchronized = Collections.synchronizedList(Arr_list);
    
    System.out.println("Synchronized list: "+Synchronized);
    
    Vector<String> v=new Vector<String>();
    v.add("AMAN");
    
    Arr_list.addAll(v);
    
    System.out.println("Vector appended: "+Arr_list);
    Arr_list.addAll(1,v);
    System.out.println("Vector appended at 1st index: "+Arr_list);
    
    Collections.copy(Arr_list,v);
    System.out.println("copied list "+Arr_list);
	}

}
