class Solution {
    public int climbStairs(int n) {
        int[] a=new int[n+1];
        a[0]=1;
        a[1]=1;
        int i=2;
        while(i<=n){
            a[i]=a[i-1]+a[i-2];
            i++;
        }
        return a[i-1];
    }
}
