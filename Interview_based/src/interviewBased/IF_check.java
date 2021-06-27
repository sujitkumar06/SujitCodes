package interviewBased;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IF_check {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(N%2!=0)
        System.out.println("Weird");
        else{
          while(N%2==0){
          if(N>=2 && N<=5)
          {System.out.println("Not Weird");
          break;}
          if(N>=6 && N<=20)
         {System.out.println(" Weird");
           break;}
          if(N>20 )
          {System.out.println("Not Weird");
           break;}
          }
        }

        scanner.close();
    }
}
