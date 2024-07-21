class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid <= high){
            if (nums[mid] == 0){
                Swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                Swap(nums, mid, high);
                high--;
            }
        }
    }
    public static void Swap(int[] nums, int i, int j){
        int temp =0;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
