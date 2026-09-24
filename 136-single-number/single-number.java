class Solution {
    public int singleNumber(int[] nums) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            int count = 0;
            int element = nums[i];

            for (int j = 0; j < length; j++) {
                if (nums[j] == element) {
                    count++;
                }
            }

            if (count == 1) {
                return element;
            }
        }

        return -1;
    }
}