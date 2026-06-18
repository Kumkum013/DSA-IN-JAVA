class UniqueElement {

    public int singleNumber(int[] nums) {

        int xor = 0;

        for(int num : nums) {
            xor = xor ^ num;
        }

        return xor;
    }
    public static void main(String[] args) {
        UniqueElement solution = new UniqueElement();
        int[] nums = {2, 2, 1};
        int result = solution.singleNumber(nums);
        System.out.println("Single number: " + result);
    }
}