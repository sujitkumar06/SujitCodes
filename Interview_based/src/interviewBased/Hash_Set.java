package interviewBased;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hash_Set {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
    int  count=0;
  HashSet<String> hs= new HashSet<String>();
    for (int i = 0; i <=t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
     hs.add(pair_left[i]);
     hs.add(pair_right[i]);
    }
    String str="";
    for(int i = 0; i <=t; i++) {
     System.out.println(str);
     if((pair_left[i]==pair_left[i+1]) && pair_right[i]==pair_right[i+1])
    	 System.out.println(count++);
   }
}
}