class Solution {
    public int largestElement(int[] nums) {
        int max = nums[0];
        for(int i=0; i<nums.length;i++)
        {
            if(max < nums[i])
            {
                max = nums[i] ;
            }
        }
         return max ;
    
    }

    public static void main(String[] args)
    {
        int[] nums ={3, 3, 0, 99, -40};
        Solution s = new Solution();
        System.out.println(s.largestElement(nums));
    }
}