public class CountSubarray
{
    public int subarraysWithXorK(int[] nums, int k)
    {
        int n= nums.length;
        int count = 0;
        for(int i=0;i<n;i++)
        {
            int xor=0;
            for(int j=i;j<n;j++) {
                xor ^= nums[j];
                if(xor == k) {
                    count++;
                }
            }

        }
        return count;
    }
    public static void main(String[] args) {
        CountSubarray c = new CountSubarray();
        int[] nums ={4, 2, 2, 6, 4};
        int result = c.subarraysWithXorK(nums, 6);
        System.out.println(result);

    }
}