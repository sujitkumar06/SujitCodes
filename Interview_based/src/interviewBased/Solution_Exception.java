package interviewBased;

import java.util.Scanner;

public class Solution_Exception {

	public static void main(String[]args)throws Exception {
	try {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int num=scan.nextInt();
	scan.close();
	int num1=scan.nextInt();

	System.out.println(a);
	System.out.println(num);
	System.out.println(num1);
	
	}
	
	catch(Exception n) {
		System.out.println("Exception is :"+n);
	}
}
}

