class Solution {
    public int[] twoSum(int[] nums, int target) {
     Map<Integer,Integer> map = new HashMap<>();
     for(int i=0;i<nums.length;i++){
         map.put(nums[i],i);
     }
     int arr[] = new int[2];
     for(int j=0;j<nums.length;j++){
         if(map.containsKey(target - nums[j]) && j != map.get(target - nums[j])){
            arr[0] = j;
            arr[1] = map.get(target - nums[j]);
            }
     }
    return arr;
    }
}