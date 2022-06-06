package lc.lc161;

class Solution {
    public int majorityElement(int[] nums) {
        return majorityElement(nums,0,nums.length-1);
    }

    public int majorityElement(int[] nums, int start, int end) {
        if(start == end){
            return nums[start];
        }
        int mid = (start+end)>>>1;
        int left = majorityElement(nums,start,mid);
        int right = majorityElement(nums,mid+1,end);
        if(left == right){
            return left;
        }
        int cntL = 0;
        int cntR = 0;
        for(int i = start; i<=end; i++){
            if(nums[i] == left){
                cntL++;
            }
            if(nums[i] == right){
                cntR++;
            }
        }
        if(cntL > cntR){
            return left;
        }
        return right;
    }
}