class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = {0,1};
        for(int i = 0 ; i<nums.length ; i++){
            int first = nums[i];
            for(int j = i+1 ; j<nums.length ; j++){
                if(first + nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
        
    }
}