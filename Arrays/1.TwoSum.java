class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> s=new HashMap<>();
        int[] out=new int[2];
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(s.containsKey(rem)){
                
                out[0]=i;
                out[1]=s.get(rem);
                return out;
            }
            s.put(nums[i],i);

        }
        return out;
    }
}
