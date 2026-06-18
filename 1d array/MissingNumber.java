public class MissingNumber{
    public int missingNumber(int[]nums)
    { 
         int n = nums.length;
            int sum = n*(n+1)/2;
            int actualSum = 0;
            for(int i=0;i<n;i++)
            {
                actualSum+=nums[i];
            }
            return sum - actualSum;
    }

    public static void main(String[] args)
    {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {3, 0, 1};
        int result = missingNumber.missingNumber(nums);
        System.out.println("Missing number: " + result);
    }
}
