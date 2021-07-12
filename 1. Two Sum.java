class Solution {
    // TimeComplexity: O(nlogn)
    // SpaceComplexity: O(n)
    public int[] twoSum(int[] nums, int target) {
        // create result array
        int[] res = new int[2];
        // copy array
        int[] copyNums = Arrays.copyOf(nums, nums.length);
        // sort array
        Arrays.sort(copyNums);
        
        int start = 0;
        int end = nums.length - 1;
        int a = 0;
        int b = 0;
        
        while(start < end){
            // we must need use sum to substitute:
            // remainingVal = target - copyNums[end], because maybe
            // there are negative numbers in the array
            int sum = copyNums[start] + copyNums[end];
            if(sum < target){
                start++;
            }else if(sum > target){
                end--;
            }else{
                a = copyNums[start];
                b = copyNums[end];
                break;
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(a == nums[i]){
                res[0] = i;
            }
        }
        
        if(a == b){
            for(int i = 0; i < nums.length; i++){
                if(b == nums[i] && i != res[0]){
                    res[1] = i;
                }
            }
        }else{
            for(int i = 0; i < nums.length; i++){
                if(b == nums[i]){
                    res[1] = i;
                }
            }
        }
        
        return res;
        
    }
}