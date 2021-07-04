package data_structures;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Linear_Search {
	
	private int Arr[];
	private int size;
	private int search_element;
   
	public Linear_Search(int Arr[], int size, int search_element) {
		this.Arr=Arr;
		this.size=size;
		this.search_element=search_element;
	}
	
	public  int Search() {
		
		for(int i=0;i<size;i++) {
			if(Arr[i]==search_element) {
             		return i+1;	}
	}
		return -1;
	}
	public static void main(String[] args) {
	

	Scanner inp= new Scanner(System.in);
	try {
	System.out.println("Enter the size of the array:");
	int size=inp.nextInt();
	int Arr[]=new int[size];
	
	System.out.println("Enter the array elements:");
	for(int i=0;i<size;i++)
	{
		System.out.println("Enter the array element number " +(i+1));
		Arr[i]=inp.nextInt();
	}
	System.out.println("Enter the element to be searched: " );
	int search_element=inp.nextInt();
	
	Linear_Search obj= new Linear_Search(Arr,size,search_element);
	int index=obj.Search();
	if (index ==-1)
		System.out.println("Sorry...Element not found in the array" );
	else
		System.out.println("Element  found in the array at index: "+index );
	}
	
	catch(Exception e) {
		System.out.println("EXception:"+e );
	}

	}
		
	}
