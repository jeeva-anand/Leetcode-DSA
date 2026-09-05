class Solution {
    public int removeDuplicates(int[] arr) {
        
       int result = 1;
       for(int i=1;i<arr.length;i++){
            if(arr[i-1] != arr[i]){
                arr[result++] = arr[i];
            }
       }
       return result;
    }
}