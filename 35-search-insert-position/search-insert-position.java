class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0 ; i<nums.length ; i++){
            int number = nums[i];
            if(number==target){return i;}
            else if(number>target){
                return i;
            }
            
            
            
            
                
            }
        return nums.length;

            
        
        
        
    }
}