package interviewBased;

import java.util.*;
import java.io.*;

class Series{

	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	          int sum=0;  
	          sum+=  (a+Math.pow(b,i));
	          System.out.print(sum+" ");
	        }
	        in.close();
	    }
	}