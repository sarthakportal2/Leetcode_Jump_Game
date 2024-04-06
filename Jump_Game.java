class Solution {
    public boolean canJump(int[] nums) {
      //T(C(N))==O(N) and S(C(N))=O(1) as it requires non additional space iteratively
        int longdist=0;//long dist declare
           for(int i=0;i<nums.length;i++){//iterating through nums size
            if(i>longdist)return false;//printing false to the current position  is greater than max(jump)'s length
            longdist=Math.max(longdist,nums[i]+i);//Longdist Calculation
        }return true;}}//printing true to num's longset jump
