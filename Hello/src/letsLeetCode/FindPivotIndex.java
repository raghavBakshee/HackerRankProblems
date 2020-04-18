/*Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.

If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.

Example 1:
Input: 
nums = [1, 7, 3, 6, 5, 6]
Output: 3
Explanation: 
The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
Also, 3 is the first index where this occurs.
*/
package letsLeetCode;

import java.io.IOException;
import java.util.Scanner;

class Solution {
    public int pivotIndex(int[] nums) {
        int pivot=0;
        
        if (nums.length==1)
        	return 0;
        while(pivot<nums.length)
        {
        	int leftsum=0,rightsum=0;
        	//left sum
        	for(int i=pivot;i>=0;i--){
        		leftsum= leftsum + nums[i];
        		        		
        	}
        	//right sum
        	for(int i=pivot;i<=nums.length-1;i++){
        	rightsum= rightsum+ nums[i];	
        		
        	}
        	
        	 if(leftsum==rightsum)
           		 return pivot;
        	 pivot++;
        	        	 
        }
       
		return -1;
                
    }
}


public class FindPivotIndex {
       
    public static void main(String[] args) throws IOException {
        int[] arr= new int[6];
    	Scanner sc = new Scanner(System.in);
        for(int i=0;i<=5;i++){
        	arr[i]= sc.nextInt();
        	
        }
            sc.close();
            int ret = new Solution().pivotIndex(arr);
            System.out.println(ret);
         
        }
}


