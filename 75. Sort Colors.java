class Solution {
    // Time complexity: O(n), actually it will be greater than n
    // less than 2n, it will also be O(n)
    // Space complexity: O(1)
    public void sortColors(int[] nums) {
        int pointer = 0;
        // first loop to find 0
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                int temp = nums[pointer];
                nums[pointer] = nums[i];
                nums[i] = temp;
                pointer++;
            }
        }
        // second loop to find 1
        for(int i = pointer; i < nums.length; i++){
            if(nums[i] == 1){
                int temp = nums[pointer];
                nums[pointer] = nums[i];
                nums[i] = temp;
                pointer++;
            }
        }
        // 0, 1 are already found, then the 2 are also found
    }
}