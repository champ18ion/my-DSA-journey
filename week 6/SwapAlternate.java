/*Swap Alternate

You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
You don't need to print or return anything, just change in the input array itself.
  
  
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
  
  
Output Format :
For each test case, print the elements of the resulting array in a single row separated by a single space.

Output for every test case will be printed in a separate line.*/


public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
      for(int i=0;i<arr.length-1;i=i+2)
      {
          int temp=arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=temp;
      }
          
    }
}
