package com.searchsortassignmaint.main;


import java.util.Scanner ;

public class PayMoneyTransaction
{
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		System.out.println("Enter the size of transaction array");
		
		int size = sc.nextInt();
		
		int[] transaction = new int[size];
		
		System.out.println("Enter the values of array");
		
		for (int i = 0; i < transaction.length ; i ++)
		{
			transaction[i]  = sc.nextInt();
		}
				
		System.out.println("Enter the total no of targets that needs to be achieved");
		
		int target = sc.nextInt();		
		
		for (int i=0; i< target ; i++) 
		{
		    System.out.println("Enter the value of target");
			
			int targetAmount = sc.nextInt();
			
			int sum = 0;
			
				for (int j=0; j < transaction.length ; j++)
				{
				  sum = sum + transaction[i];
					  if (sum >= targetAmount)
					  {
						  System.out.println("Target achieved after "+( j + 1 )+" transactions");
						  break ;
					  }
					  
					  if (j== transaction.length - 1)
					  {
						  System.out.println("Given target is not achieved");	  
					  }
					  
				}
				
		}

	}
}
