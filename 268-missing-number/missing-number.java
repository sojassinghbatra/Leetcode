class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int missing = 0 ;
        for(int i = 0; i<n+1 ; i++){
            int count = 0;
            for(int j = 0 ; j<n ; j++){
                if(i==nums[j]){
                    count++;
                    break;
                }
            }
            if(count==0){
                missing = i;
                break;
            }
            
        }
        return missing;
        
    }
}