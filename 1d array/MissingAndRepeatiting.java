import java.util.Arrays;

class MissingAndRepeatiting {

    public int[] findMissingRepeatingNumbers(int[] nums) {

        int n = nums.length;

        int repeating = -1;
        int missing = -1;

        for(int i = 1; i <= n; i++) {

            int count = 0;

            for(int j = 0; j < n; j++) {

                if(nums[j] == i) {
                    count++;
                }
            }

            if(count == 2) {
                repeating = i;
            }

            if(count == 0) {
                missing = i;
            }
        }

        return new int[]{repeating, missing};
    }
    public static void main(String[] args) {
        MissingAndRepeatiting m = new MissingAndRepeatiting();
        int[] nums = {1, 2, 3, 6, 7, 5, 7};
        System.out.println(Arrays.toString(m.findMissingRepeatingNumbers(nums)));
    }
}