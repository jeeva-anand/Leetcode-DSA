class Solution {
    public int[] sortedSquares(int[] nums) {
        
        
        int len = nums.length;
                     
        int res[] = new int[len];
        int start =0, end = len-1, i = len-1;
        int startSq = 0, endSq = 0;
        
        while(start <= end){
            startSq = nums[start]  * nums[start] ;
            endSq = nums[end] * nums[end] ;

            if(endSq > startSq){
                res[i] = endSq;
                end--;
                
            }                
            else{
                res[i] = startSq;
                start++;
            }                
            i--;
        }

        return res;

    }
}