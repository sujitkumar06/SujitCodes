package interviewBased;

import java.io.*;
import java.util.*;

public class Palindrome_string {

	     public  static boolean StringReverse(String A) {
         int i=0; 
	     int j=A.length()-1;
	   
	     while(i<j) {
	    	 if(A.charAt(i)!=A.charAt(j))
	    		 return false;
	    	 else
	    		 i++;
	            j--;
	     }
	     return true;
}
	 

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.nextLine();
	     //   Palindrome_string obj = new Palindrome_string();
	        boolean Result=Palindrome_string.StringReverse(A);
	        
	        if(Result ==true)
	        System.out.println("Palindrome");
	        else
	        	System.out.println("Not Palindrome");
	        
	    }
	}


