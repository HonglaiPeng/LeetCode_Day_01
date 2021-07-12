class Solution {
    // Two pointers
    // Time complexity: O(n)
    // Space complexity: O(1)
    public int removeElement(int[] nums, int val) {
        // we hold the nextElement pointer, starting from index 0
        // then we use second pointer i to traverse the array,
        // if we find value which doesnt equal given val, then 
        // we put the value on the nextElement
        int nextElement = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[nextElement] = nums[i];
                nextElement++;
            }
        }
        // input will be [0,1,2,2,3,0,4,2]
        // output will be [0 1 3 0 4 0 4 2] 
        // we could tell that we actually dont move the values
        // in the array, we only replace the first several fields 
        // with the values which are not key val.
        for(int num : nums){
            System.out.print(num + " ");
        }
        return nextElement;
    }
}