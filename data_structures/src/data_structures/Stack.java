package data_structures;

import java.util.Scanner;

public final class Stack {
	
	int Arr[];
	final int MAX;
    int top=-1;
    
	public Stack(int Arr[], int MAX) {
	
		this.Arr=Arr;
		this.MAX=MAX;
	}
	
	void push(int num) {
		if(top>=MAX-1)
			System.out.println("Overflow condition");
		else
			Arr[++top]=num;
		
	}

	int pop() {
		int x=0;
		if(top<0)
			System.out.println("Underflow condition");
		else
			 x = Arr[top--];
		return x;
	}
	

	public static void main(String[] args) {
		
		Scanner inp =new Scanner(System.in);
		System.out.println("Enter the max size of the stack");
		int size=inp.nextInt();
		
		int A[]=new int[size];
		Stack obj =new Stack(A,size);
	   boolean Continue= true;
		while(Continue) {
		System.out.println("Press 1 to push element, Press 2 to pop element ");
		int select=inp.nextInt();
		
		switch( select) {
		
		case 1:
			System.out.println("Enter  number of elements you wish to add: ");
			int num=inp.nextInt();	
			for(int i=0;i<num;i++) {
				System.out.println("Enter element number " +(i+1)+ " to be added: ");
				int element=inp.nextInt();
				obj.push(element);
				}
				System.out.println("Stack");
				for(Integer Array: A)
				System.out.print(Array+ "  ");
				System.out.print("\n ");
				System.out.println("Do you want to  continue stack operations?? Enter true or false");
				 Continue=inp.nextBoolean();
				break;
				
		case 2:
			
			System.out.println("Enter  number of elements you wish to delete: ");
			int del=inp.nextInt();	
			for(int i=0;i<del;i++) {
				obj.pop();
				}
			System.out.println("Stack");
			for(Integer Array: A)
			System.out.print(Array+ " ");
			System.out.print("\n ");
			System.out.println("Do you want to  continue stack operations??");
			Continue=inp.nextBoolean();
			break;
			
			default:
				System.out.println("Wrng entry: ");
		}
		}

	}

}
