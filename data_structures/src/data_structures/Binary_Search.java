package data_structures;

import java.util.Scanner;

public class Binary_Search {
	int Arr[];
	int size;
	int Search_Element;

	public Binary_Search(int Arr[], int size, int Search_Element) {
		this.Arr=Arr;
		this.size=size;
		this.Search_Element=Search_Element;
	}
	
	public int Search() {
		int first=0;
		int last=size-1;
        int mid;
		
        for(int i= 0;i<size;i++) {
			mid=(first+last)/2;
           if(Search_Element==Arr[mid])  
        	   return mid;
           if(Search_Element<Arr[mid])
        	   last=mid-1;
           else
               first=mid+1;
        }	
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner inp= new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int length= inp.nextInt();
		
		int A[]=new int[length];
		
		System.out.println("Enter the members of the array: ");	
	    for(int i= 0;i<length;i++) {
	    	System.out.println("Enter the array number "+(i+1));
	    	A[i]= inp.nextInt();
	    }
		System.out.println("Enter the element to be searched in the array: ");
		int Search= inp.nextInt();
		Binary_Search obj= new Binary_Search(A,length,Search);
		int index=obj.Search();
		
		if(index==-1)
		System.out.println("Sorry ..member not present in the array: ");
		else
		System.out.println("Member present at the index : " +(index+1));
}
}
