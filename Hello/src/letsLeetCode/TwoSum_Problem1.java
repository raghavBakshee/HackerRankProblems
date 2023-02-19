package letsLeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_Problem1 {
    public static int[] twoSum(int[] nums, int target) {
        // for(int i = 0; i < nums.length; i++)
        // {
        // for(int j = i + 1; j < nums.length; j++)
        // {
        // if(nums[j] + nums[i] == target)
        // return new int[]{i, j};
        // }
        // }
        // return new int[]{};
        // Above one is O(n-square) time complexity, Below is the better approach

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                return new int[]{i, map.get(nums[i])};
            }
            else
            {
                map.put(target - nums[i], i);
            }
        }
    return new int[]{};
    }
    public static void main(String[] args) {
        System.out.println(TwoSum_Problem1.twoSum(new int[]{3,2,4}, 6));
    }
}
