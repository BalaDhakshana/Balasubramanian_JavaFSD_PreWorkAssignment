import java.util.Scanner;
public class PreWorkAssignment_13August2022 {

	public static void main(String[] args) 
	{
		 //function to printPattern
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

		+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

		+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

		System.out.println();
		int myChoice = myScanner.nextInt();
		
		
		
		switch(myChoice)
		{
		case 1:
		{
			System.out.println("Enter the number to check the Palindrome ");
			int IsAPalindrome = myScanner.nextInt();
			int tempVar = IsAPalindrome, concatVar = 0, quotientVar = 0, reverseNum = 0;
			if ( tempVar > 0 )
			{
				do 
				{
				concatVar =  tempVar % 10 ;
				quotientVar = tempVar / 10 ;
				tempVar = quotientVar;
				
				reverseNum = (reverseNum * 10 ) + concatVar ;
				
				}while (tempVar > 0);
			}
			
			if (reverseNum == IsAPalindrome) 
				System.out.println(IsAPalindrome + " is a palindrome number");
			else
				System.out.println(IsAPalindrome + " is not a palindrome number");
			break;
		}
		case 2:
		{
			System.out.println("Enter the number to check Print Pattern ");
			int noOfPattern = myScanner.nextInt();
	 		if (noOfPattern <= 0 ) 
	 			System.out.println("Enter the valid number");
	 		else
	 		{
	 			for (int i = 0 ;i < noOfPattern;i++)
	 			{
	 				for (int j = i ;j<noOfPattern;j++)
	 				{
	 					System.out.print("*");
	 				}
	 				System.out.println(" ");
	 			}
	 		}
	 		break;
		}
		case 3:
		{
			System.out.println("Enter the number to check whether the # is a  prime number or not");
			long checkPrimeNumber = myScanner.nextLong();
			boolean ItsNotPrimeNumber = false;
			long divideByTwo;
			if (checkPrimeNumber == 0 || checkPrimeNumber == 1)
			{	
				System.out.println("Enter a valid number");
				
			}
			else
			{
				if (checkPrimeNumber%2 == 0)
				{
					System.out.println(checkPrimeNumber + " is not a prime number");
				}
				else
				{	
					divideByTwo  = checkPrimeNumber /2 ;
					for (int i = 2 ; i < divideByTwo; i++)
					{
						if ( checkPrimeNumber % i == 0 )
						{
							System.out.println(checkPrimeNumber + " is not a prime number");
							ItsNotPrimeNumber = true;
							break;
						}
					}
					
					if ( ItsNotPrimeNumber == false ) System.out.println(checkPrimeNumber + " is a prime number");
				}
				
			}
			break;
		}
		case 4:
		{
			System.out.println("Enter a number to check the fibonaocci series ");
			long checkfibonacci = myScanner.nextLong();
			int i =0,previousNumber = 0, iterration = 0;
			do
			{
				
				iterration = iterration + 1;
				System.out.println(i);
				if (i == 0 )
				{
					i = i + 1;
				}
				else
				{
					
					i = i + previousNumber;
					previousNumber = i - previousNumber;
				}
				
				
			}
			while (iterration < checkfibonacci );
			break;
		}
		
		}
		
		
	    
	
	          
	}
}
