/*Arrange Numbers In Array
Send Feedback
You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
  
  Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains an integer 'N'.
  
  
Output Format :
For each test case, print the elements of the array/list separated by a single space.

Output for every test case will be printed in a separate line.*/


public class Solution {
    
   public static void arrange(int[] arr, int n) {
    	//Your code goes here
        int idx=0;
        //System.out.print(arr.length + " ");
        for (int i=1;i<=n;i=i+2)
        {
            arr[idx]=i;
            //System.out.print(arr[idx]+ " ");
            idx=idx+1;
            
        }
        int i=0;
        
        if (n%2==0)
        {
            i=n;
        }
        else
        {
            i=n-1;
        }
        
        for (;i>=2;i=i-2)
        {
            arr[idx]=i;
            //System.out.print(arr[idx]+ " ");
            idx=idx+1;
            
        }
        //System.out.println("");
        
    }
}
