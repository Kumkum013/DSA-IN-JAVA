import java.util.Arrays;

public class RemoveDuplicates {
    public int[] RemoveDuplicates(int[] nums) {
        if(nums.length == 0)
        {
            return new int[0];
        }
         int i = 0 ; 
         for(int j=1 ; j< nums.length; j++)
         {
            if(nums[j] != nums[i])
            {
                i++ ;
                nums[i] = nums[j];
            }
         }
         return Arrays.copyOfRange(nums, 0, i + 1);
         //return i + 1;

        
    }

    public static void main(String[]args)
    {
       RemoveDuplicates s = new RemoveDuplicates();
        int[] nums = {-30, -30, 0, 0, 10, 20, 30, 30};
        int[] result = s.RemoveDuplicates(nums);
        System.out.println(Arrays.toString(result));
    }
}