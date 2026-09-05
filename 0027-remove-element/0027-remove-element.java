class Solution {
    public int removeElement(int[] nums, int val) {
        
        int start = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start++] = temp;
            }
        }
        return start;
    }
}