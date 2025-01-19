class Solution {
    public void moveZeroes(int[] nums) {

        int start=0,end=nums.length-1;
        while(start<end){
            if(nums[start]==0){
                for(int j=start+1;j<=end;j++)
                   nums[j-1]=nums[j];
              nums[end--]=0;     
            }
            else
             start++;
        }
   
    }
}
