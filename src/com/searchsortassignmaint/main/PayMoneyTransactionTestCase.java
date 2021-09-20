package com.searchsortassignmaint.main;

import java.util.Scanner;

public class PayMoneyTransactionTestCase {
	
	private static Scanner sc = new Scanner(System.in);
	
		int size,sum;	
		
		public static void executeTestCase(int testcase)
		{
			int sum,size,target;
			int runtestcase = testcase;
			
			if (runtestcase ==1)
			{
				System.out.println("Enter the size of transaction array");
				size = 3;
				System.out.println(size);
				System.out.println("Enter the values of array");
				int transaction[] = {21,12,31};
				for (int m=0; m<size;m++)
				{
				System.out.println(transaction[m]);	
				}
				System.out.println("Enter the total no of targets that needs to be achieved");
				target = 2;
				System.out.println(target);
				int targetAmount[] = {19,21};
				
				sum = 0;
				
		        for (int i=0; i <targetAmount.length; i++) 
		        {
		        System.out.println("Enter the value of target");
		        System.out.println(targetAmount[i]);
					for ( int j =0;j < transaction.length ; j++)
						{
						      sum = sum + transaction[j];
						      //System.out.println("Enter the value of target"+targetAmount[i]);
							  if (sum >= targetAmount[i])
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
			
			if (runtestcase ==2)
			{
				System.out.println("Enter the size of transaction array");
				size = 1;
				System.out.println(size);
				System.out.println("Enter the values of array");
				int transaction[] = {100};
				for (int m=0; m<size;m++)
				{
				System.out.println(transaction[m]);	
				}
				System.out.println("Enter the total no of targets that needs to be achieved");
				target = 1;
				System.out.println(target);
				int targetAmount[] = {101};
				
				sum = 0;
				
		        for (int i=0; i <targetAmount.length; i++) 
		        {
		        System.out.println("Enter the value of target");
		        System.out.println(targetAmount[i]);
					for ( int j =0;j < transaction.length ; j++)
						{
						      sum = sum + transaction[j];
						      //System.out.println("Enter the value of target"+targetAmount[i]);
							  if (sum >= targetAmount[i])
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
			if (runtestcase > 2 || runtestcase < 1)
			{
				System.out.println("Please provide valid test case");		
			}
        }
			
	        public static void main(String args[])
	        {
	        	
	        System.out.println("Test Case ");
	        
			int testcaseMain = sc.nextInt();
			
			executeTestCase(testcaseMain);	
	        }	
	        
	}	
	
