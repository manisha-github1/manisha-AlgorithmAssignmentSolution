package com.searchsortassignmaint.main;

import java.util.Scanner;

import com.searchsortassignmaint.main.MergeSortImplementation;

public class MinimumNotesPaymentTestCase {
	
	private static Scanner sc = new Scanner(System.in);
	
	int size,sum;	
	
	public static void executeTestCase(int testcase)
	{
		int sum,size,target;
		int runtestcase = testcase;
		if (runtestcase ==1)
		{ 
			System.out.println( "Enter the size of currency denominations" );
			size = 3;
			System.out.println(size);
			int[] notes =  {5,1,10};
			System.out.println( "Enter the currency denominations value : " );
			for (int m=0; m<size;m++)
			{
			System.out.println(notes[m]);	
			}
			System.out.println( "Enter the amount you want to pay" );
			int amount = 12;
			System.out.println(amount);
			MergeSortImplementation ms = new MergeSortImplementation();
			ms.sort( notes, 0, notes.length - 1 );
			
			int[] numNotes = new int[size];
			for( int i = 0; i < notes.length; i++ ) 
			{
			// Find out how many of the current note (denomination) needs to be paid and make note of it (in another array)
				numNotes[i] = (int) ( amount / notes[i] );
				amount = amount % notes[i]; // remaining amount
			}
			
			if( amount != 0 ) {
				System.out.println( "Not possible to pay" );
			} else {
				System.out.println( "Your payment approach in order to give min no of notes will be ");
				for( int i = 0; i < size; i++ ) {
					if (numNotes[i] > 0)	
					System.out.println(notes[i] + " : " + numNotes[i] );
				}
			}
		}
		if (runtestcase ==2)
		{ 
			System.out.println( "Enter the size of currency denominations" );
			size = 5;
			System.out.println(size);
			
			int[] notes =  {60,5,12,78,25};
			
			System.out.println( "Enter the currency denominations value : " );
			for (int m=0; m<size;m++)
			{
			System.out.println(notes[m]);	
			}
			
			System.out.println( "Enter the amount you want to pay" );
			int amount = 128;
			System.out.println(amount);
			
			MergeSortImplementation ms = new MergeSortImplementation();
			
			ms.sort( notes, 0, notes.length - 1 );
			
			int[] numNotes = new int[size];
			for( int i = 0; i < notes.length; i++ ) 
			{
			// Find out how many of the current note (denomination) needs to be paid and make note of it (in another array)
				numNotes[i] = (int) ( amount / notes[i] );
				amount = amount % notes[i]; // remaining amount
			}
			
			if( amount != 0 ) {
				System.out.println( "Not possible to pay" );
			} else {
				System.out.println( "Your payment approach in order to give min no of notes will be ");
				for( int i = 0; i < size; i++ ) {
					if (numNotes[i] > 0)	
					System.out.println(notes[i] + " : " + numNotes[i] );
				}
			}
		}
		if (runtestcase ==3)
		{ 
			System.out.println( "Enter the size of currency denominations" );
			size = 4;
			System.out.println(size);
			
			int[] notes =  {12,5,123,18};
			
			System.out.println( "Enter the currency denominations value : " );
			for (int m=0; m<size;m++)
			{
			System.out.println(notes[m]);	
			}
			
			System.out.println( "Enter the amount you want to pay" );
			int amount = 158;
			System.out.println(amount);
			
			MergeSortImplementation ms = new MergeSortImplementation();
			ms.sort( notes, 0, notes.length - 1 );
			
			int[] numNotes = new int[size];
			for( int i = 0; i < notes.length; i++ ) 
			{
			// Find out how many of the current note (denomination) needs to be paid and make note of it (in another array)
				numNotes[i] = (int) ( amount / notes[i] );
				amount = amount % notes[i]; // remaining amount
			}
			
			if( amount != 0 ) {
				System.out.println( "Not possible to pay" );
			} else {
				System.out.println( "Your payment approach in order to give min no of notes will be ");
				for( int i = 0; i < size; i++ ) {
					if (numNotes[i] > 0)	
					System.out.println(notes[i] + " : " + numNotes[i] );
				}
			}
		}
		
	}
	public static void main(String args[])
    {
    	
    System.out.println("Test Case ");
    
	int testcaseMain = sc.nextInt();
	
	executeTestCase(testcaseMain);	
    }	
    

}
