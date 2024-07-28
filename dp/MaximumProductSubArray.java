class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        double[] dp=new double[n];
        Arrays.fill(dp,1);
        int max=nums[0];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                // double temp=;
                dp[j]=dp[j]*nums[i];
                
                if (max<dp[j]) max=(int)dp[j];;
            }
        }

        return max;
    }
}
