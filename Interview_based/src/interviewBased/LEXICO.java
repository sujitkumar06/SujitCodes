package interviewBased;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LEXICO {
	

	  
	    public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        for(int i = 0;i<=s.length()-k;i++){
	             String subString = s.substring(i,i+k);
	             if(i == 0){
	                 smallest = subString;
	             }
	             if(subString.compareTo(largest)>0)
	                 largest = subString;
	             else if(subString.compareTo(smallest)<0)
	                 smallest = subString;
	      }
	        
	        return smallest + "\n" + largest;
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the string:");
	        String s = scan.nextLine();
	        System.out.println("Enter the key:");
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }
	}