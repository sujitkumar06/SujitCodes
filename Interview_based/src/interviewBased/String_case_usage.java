package interviewBased;

import java.io.*;
import java.util.*;

public class String_case_usage {

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        char[]A_ch=A.toCharArray();
	        char[]B_ch=B.toCharArray();
	        char A_1='\0';
	        char B_1='\0';
	        //length
	        int A_length=A.length();
	        int B_length=B.length();
	        int sum_length=A_length+B_length;
	        System.out.println(sum_length);
	        
	        for(int i=0; i<1; i++){
	         A_1=Character.toUpperCase(A_ch[0]);
	         B_1=Character.toUpperCase(B_ch[0]);
	        
	      if(A.charAt(0)>B.charAt(0))//or A_ch[0]>B_ch[0]
	       System.out.println("Yes");
	     else
	      System.out.println("No");
	       }
	     System.out.print(A_1);
	        for(int i=1; i<A_length; i++){
	        System.out.print(A_ch[i]);
	        }
	        System.out.print(" "+B_1);
	        for(int i=1; i<B_length; i++){
	        System.out.print(B_ch[i]);
	        }
	    }
	}

/*public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        
        System.out.println( A.length() + B.length() );
        System.out.println( (A.compareTo(B) > 0) ? "Yes" : "No");
        System.out.println(
            A.substring(0, 1).toUpperCase() + A.substring(1) + " " +
            B.substring(0, 1).toUpperCase() + B.substring(1)
        );
    }
}*/

