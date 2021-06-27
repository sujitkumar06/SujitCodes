package interviewBased;

import java.util.Arrays;
public class Anagram {
	static char A[];
	static char B[];

	public Anagram(char A[], char B[]) {
		Anagram.A=A;
		Anagram.B=B;
		
	}
	 static boolean areAnagram() {
		
	int n1=A.length;
	int n2=B.length;
	
	if(n1!=n2)
		return false;
	else
 Arrays.sort(A);
 Arrays.sort(B);
 
 for(int i= 0;i<n1;i++) {
	if( A[i]==B[i])
 return true;
 break;
 }
return false;
	 }
	

	public static void main(String[] args) {
	   
		char[] x= {'a','b'};
		char[] y= {'b','a'};
		Anagram obj = new Anagram(x,y);
		boolean check=Anagram.areAnagram();
		
		if (check==false)
				System.out.println("Not ANAGRAM");
		else
			System.out.println("ANAGRAM");
	}

	}

