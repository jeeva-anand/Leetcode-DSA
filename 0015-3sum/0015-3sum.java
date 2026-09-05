class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       int n = nums.length;

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            int p1 = i + 1, p2 = n - 1;
            if (i > 0 && nums[i - 1] == nums[i])
                continue;
            while (p1 < p2) {
                int sum = nums[i] + nums[p1] + nums[p2];
                if (sum == 0) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[p1] , nums[p2]);
                    res.add(temp);
                   
                    p1++;
                    p2--;

                     while(p1<p2 && nums[p1] == nums[p1-1]) p1++;
                     while(p1<p2 && nums[p2] == nums[p2+1]) p2--;
                     
                } else if (sum > 0)
                    p2--;
                else
                    p1++;
            }
        }

        return new ArrayList<>(res);
    }
}