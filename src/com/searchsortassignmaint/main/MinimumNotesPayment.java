package com.searchsortassignmaint.main;

import java.util.Scanner;

import com.searchsortassignmaint.main.MergeSortImplementation;

public class MinimumNotesPayment {
	
	private static Scanner sc = new Scanner( System.in );
	
	public static void main( String[] args ) {
		// accept number of denominations (eg. 3) - size
		System.out.println( "Enter the size of currency denominations" );
		int size = sc.nextInt();
		
		// allocate a notes array of that size
		int[] notes = new int[size];
		
		// accept the denominations (loop)
		System.out.println( "Enter the currency denominations value : " );
		for( int i = 0; i < size; i++ ) {
			notes[i] = sc.nextInt();
		}
		
		// accept the amount
		System.out.println( "Enter the amount you want to pay" );
		int amount = sc.nextInt();
		
		MergeSortImplementation ms = new MergeSortImplementation();
		ms.sort( notes, 0, notes.length - 1 );
		
		// Go through the notes array
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
