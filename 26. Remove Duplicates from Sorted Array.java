class Solution {
    // here we use two pointers method
    // Time complexity:
    // Space complexity:
    public int removeDuplicates(int[] nums) {
        int nextNonDuplicate = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[nextNonDuplicate - 1] != nums[i]){
                nums[nextNonDuplicate] = nums[i];
                nextNonDuplicate++;
            }
        }
        return nextNonDuplicate;
    }
    
}