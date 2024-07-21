class Solution {
    public int minMoves(int[] nums) {
        int sum=0,min=Integer.MAX_VALUE,l=nums.length;
        for(int i=0;i<l;i++){
            sum+=nums[i];
            min=Math.min(min,nums[i]);
        }
        return sum-min*l;
    }
}
