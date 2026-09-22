class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int length=0;
    int result=Integer.MAX_VALUE;
    int sum=0;

    int low=0;
    int high=0;

    while(high<nums.length){
        sum=sum+nums[high];
        while(sum>=target){
            length=high-low+1;
            result=Math.min(result,length);
            sum=sum-nums[low];
            low++;
        }high++;
    }if(result == Integer.MAX_VALUE)
        return 0;
    return result;
    
    }    
    }