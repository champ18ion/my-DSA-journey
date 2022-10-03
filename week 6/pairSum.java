/*Pair Sum

You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.
Note:
Given array/list can contain duplicate elements. 
  
  
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains an integer 'X'.
  
  
Output format :
For each test case, print the total number of pairs present in the array/list.

Output for every test case will be printed in a separate line.*/


public class Solution {

public static int pairSum(int arr[], int x) {
int numPairs = 0;
for(int i = 0; i < arr.length; i++) {
for(int j = i + 1; j < arr.length; j++) {
if(arr[i] + arr[j] == x) {
numPairs += 1;
}
}
}
return numPairs;
}
}
