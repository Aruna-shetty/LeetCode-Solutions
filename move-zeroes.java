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

//Solution-2

class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroindex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroindex++] = nums[i];
            }
        }

        for (int i = lastNonZeroindex; i < nums.length; i++) {
            nums[i] = 0;
        }

    }
}
