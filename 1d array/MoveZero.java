public class MoveZero {

    public void moveZeroes(int[] nums) {

        int i = 0;

        for(int j = 0; j < nums.length; j++) {

            if(nums[j] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZero moveZero = new MoveZero();
        int[] nums = {0, 1, 0, 3, 12};
        moveZero.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}