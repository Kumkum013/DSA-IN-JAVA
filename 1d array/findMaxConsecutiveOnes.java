class ConsecutiveOnes{

    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxCount = 0;

        for(int num : nums) {

            if(num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else {
                count = 0;
            }
        }

        return maxCount;
    }
    public static void main(String[] args) {
        ConsecutiveOnes solution = new ConsecutiveOnes();
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = solution.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive ones: " + result);
    }
}