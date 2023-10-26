class day3 {
    public int maxSubArray(int[] nums) {
        int i, maxmax=Integer.MIN_VALUE, maxhere=0;
        for(i=0; i<nums.length;i++)
        {
            maxhere+=nums[i];
            if(maxmax<=maxhere)
            maxmax=maxhere;

            if(maxhere<0)
            maxhere=0;

        }
        return maxmax;
    }
}

//same thing diff style

class Solution {
    public int maxSubArray(int[] nums) {
        int maxmax=Integer.MIN_VALUE, maxhere=0;
        for(int i : nums)
        {
            maxhere+=i;
            
            maxmax=Math.max(maxmax, maxhere);

            if(maxhere<0)
            maxhere=0;

        }
        return maxmax;
    }
}