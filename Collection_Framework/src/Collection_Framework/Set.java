package Collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
	
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("AAAA");
		set.add("NNN");
		set.add("CCCCCC");
		
		
		LinkedHashSet<String> lhashset= new LinkedHashSet<String>();
		
		lhashset.add("AAddAA");
		lhashset.add("NNddN");
		lhashset.add("CCCCddCC");
		lhashset.add( ("1"));
		
		TreeSet<String> treeset= new TreeSet<String>();
		
		treeset.add("AAddAA");
		treeset.add("NNddN");
		treeset.add("CCCCddCC");
		treeset.add( ("1"));
		System.out.println("linked HASH SET:"+ lhashset);
		System.out.println("tree SET:"+ treeset);
		int size=set.size();
		
		System.out.println("HASH SET:"+ set);
		
		System.out.println("size set:"+ size);
		set.clear();
	}

}
