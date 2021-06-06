package data_structures;

import java.util.Scanner;
import java.io.*;
//public class bubble_sort
 class bubble{
	int Array[];
	int size;
	//parameterized constructor to initialize the instance variable provided array
	bubble(int Array[],int size) {
		this.Array=Array;
		this.size=size;
	}
	
	public void Sort() {
	for(int i=0;i<size;i++) {
		for(int j=i+1;j<size;j++) {
			if(Array[i]>Array[j]) {
				int temp;
				temp=Array[i];
			    Array[i]=Array[j];
			    Array[j]=temp;
			}
		  }
		}
	}
 
	
	public static void main(String[] args)
	{
		
		System.out.println("Enter the size of the array: ");
		Scanner inp=new Scanner(System.in);
		int n=inp.nextInt();
		
		int A[]=new int[n];
		
		System.out.println("Enter the elements of the array: ");
		
		for(int k=0;k<n;k++)
		{
			System.out.println("Enter element no" + (k+1));
			A[k]=inp.nextInt();
		}
	bubble obj = new bubble(A,n);
	obj.Sort();
		
		System.out.println("Sorted arrray in ascending order: ");
		for(int l=0;l<n;l++)
		{
			System.out.println(A[l]);
		}
	}
 }

