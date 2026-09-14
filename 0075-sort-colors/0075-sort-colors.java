class Solution {
    public void sortColors(int[] nums) {
        
        int n = nums.length;
        
        int red = 0;
        int green = 0;
        int blue = 0;
        int idx = 0;
        

        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                red++;
            }else if(nums[i] == 2){
                blue++;
            }else green++;
        }

        while(red-- > 0){
            nums[idx++] = 0;
        }

        while(green-- > 0){
            nums[idx++] = 1;
        }

        while(blue-- > 0){
            nums[idx++] = 2;
        }

        
    }
}