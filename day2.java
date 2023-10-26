class day2 {
    public void sortColors(int[] nums) {
        int low=0,mid=0,temp=0;
        int high = nums.length -1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                mid++; low++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
        
    }
}