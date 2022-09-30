/*Find Duplicate

You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
Note :
Duplicate number is always present in the given array/list.
  
  
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
  
  
Output Format :
For each test case, print the duplicate element in the array/list.

Output for every test case will be printed in a separate line.*/


/* approach is to make use of the condition that all elements lies between 0
and n-2. So first calculate the sum of all natural numbers between 0 to n-2 by using the direct
formula ((n - 1) * (n - 2)) / 2 and sum of all elements of the array. Now, subtract the sum of all
natural numbers between 0 to n-2 from sum of all elements of the array. This will give you the
duplicate element present in the array.*/

public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
       int sum=0;
       int n=arr.length;
        
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
     //sum of 0 to n-2 natural numbers 
       int naturalSum=((n-1)*(n-2))/2;
        
        return sum-naturalSum;
       
    }
}
