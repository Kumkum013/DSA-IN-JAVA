public class ReturnTargetIndex{
    public int search(int[]nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ReturnTargetIndex returnTargetIndex = new ReturnTargetIndex();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        int result = returnTargetIndex.search(nums, target);
        System.out.println("Target index: " + result);
    }

}