/*

1. Two Sum

Question: https://leetcode.com/problems/two-sum/

*/


/* 

Easy to understand

*/

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] indices = new int[2];
        
        for( int i = 0; i < nums.length; i++ ){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
            }
        }
        
        return indices;
    }
}


/*

Optimised solution

*/


public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        int[] indices = new int[2];
        
        for( int i = 0; i < nums.length; i++ ){
            Integer val = hm.get(target-nums[i]);
            if( val != null ){
                indices[0] = val;
                indices[1] = i;
                break;
            }
            hm.put(nums[i],i);
        }
        
        return indices;
    }
}