package com.searchsortassignmaint.main;

import java.util.Scanner;


public class MinimumNotesPayment {
	
	private static Scanner sc = new Scanner( System.in );
	
	void merge(int arr[], int left, int mid, int right) {
		// Find sizes of two sub arrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		/* Create temporary arrays */
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		/* Copy data to temporary arrays */
		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[mid + 1 + j];

		/* Merge the temporary arrays */

		// Initial indexes of first and second sub-arrays
		int i = 0, j = 0;

		// Initial index of merged sub-array array
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] >= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	// Main function that sorts array[left...right] using merge()
	public void sort(int[] notes, int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = (left + right) / 2;

			// Sort first and second halves
			sort(notes, left, mid);
			sort(notes, mid + 1, right);

			// Merge the sorted halves
			merge(notes, left, mid, right);
		}
	}
	
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
		
		MinimumNotesPayment ms = new MinimumNotesPayment();
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
