class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int min = 0; 
        int max = n;
        
        for(int num = min; num <= max; num++){
            boolean found = false;
            for(int i = 0; i < n; i++){
                if(nums[i] == num){
                    found = true;
                    break; 
                }
            }
            if(!found){
                return num; 
            }
        }
        return -1;
    }
}
