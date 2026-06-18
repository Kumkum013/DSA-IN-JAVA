import java.util.* ;
class SortedArray{
    public int[] unionArray(int[] nums1, int[] nums2) 
    {
        TreeSet<Integer> set = new TreeSet<>();
        for(int num:nums1)
        {
            set.add(num);
        }

        for(int num : nums2)
        {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for(int num : set)
        {
            result[index++]= num;
        }
        return result ;
    }
    public static void main(String[]args)
    {
        int[] nums1 = {3, 4, 4, 4};
        int[] nums2 = {6, 7, 7};
        SortedArray  s = new SortedArray();
        System.out.println(Arrays.toString(s.unionArray(nums1,nums2)));

    }

    
}