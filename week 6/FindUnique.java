/*Find Unique

You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
  
  
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
  
  
Output Format :
For each test case, print the unique element present in the array.

Output for every test case will be printed in a separate line.*/

public class Solution{

public static int findUnique(int[] arr){
for(int i = 0; i < arr.length; i++) {
int j;
for(j = 0; j < arr.length; j++) {
if(i != j) {
if(arr[i] == arr[j]) {
break;
}
}
}
if(j == arr.length) {
return arr[i];
}
}
/*
The function would never return from this line
since the input array always contains a unique value.
To avoid the ambiguity at the compile time,
the function necessarily has to return a value in case
the line number 22 doesn't return the desired value during
the execution of the for loop.
*/
return Integer.MAX_VALUE;
}
}
