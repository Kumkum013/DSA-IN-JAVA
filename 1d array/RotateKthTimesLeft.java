public class RotateKthTimesLeft {

    public void rotateLeftByKthTimes(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        int[] temp = new int[n];

        int index = 0;

        for(int i = k; i < n; i++) {
            temp[index++] = nums[i];
        }

        for(int i = 0; i < k; i++) {
            temp[index++] = nums[i];
        }

        for(int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        RotateKthTimesLeft s = new RotateKthTimesLeft();

        int[] nums = {1, 2, 3, 4, 5};

        int k = 2;

        s.rotateLeftByKthTimes(nums, k);

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}