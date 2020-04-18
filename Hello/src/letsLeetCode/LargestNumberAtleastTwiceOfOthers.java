package letsLeetCode;

import java.io.IOException;
import java.util.Scanner;


class Solution2 {
    public int dominantIndex(int[] nums) {
       int first=0,second=0,index=0;
    	for(int i=0;i<=nums.length-1;i++){
    		if(nums[i]>first){
    			second=first;
    			first=nums[i];
    			index=i;
    			}
    		else if(nums[i]>second && nums[i]!=first)
    			second=nums[i];
    		   		
    	}
    	return (first>=2*second)?index:-1;
    			
    
}}

public class LargestNumberAtleastTwiceOfOthers {
    
    public static void main(String[] args) throws IOException {
        int[] arr= new int[4];
    	Scanner sc = new Scanner(System.in);
        for(int i=0;i<=3;i++){
        	arr[i]= sc.nextInt();
        	
        }
            sc.close();
            int ret = new Solution2().dominantIndex(arr);
            System.out.println(ret);
         
        }
}
