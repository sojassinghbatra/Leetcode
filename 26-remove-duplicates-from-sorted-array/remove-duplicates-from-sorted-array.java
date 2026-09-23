class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        
        int[] nums2 = new int[length];
        int k = 0;
        for(int i = 0 ; i<length ; i++){
            int number = nums[i];
            int count = 0;

            for(int j = 0 ; j<k ; j++){
                if(nums2[j] == number){count++;}

            }
            if(count==0){
                nums2[k]=number;
                k++;
            }
        }
        for(int i = 0 ; i<k ; i++){
            nums[i] = nums2[i];
        }
        return k;
        }
        
        
    }
