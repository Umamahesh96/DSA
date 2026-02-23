


//Two Pointer Approach 
class Solution{
    public int removeDuplicates(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int writePos = 0;
        for(int readPos = 1; readPos < nums.length; readPos++){
            if(nums[writePos] != nums[readPos]){
                writePos++;
                nums[writePos] = nums[readPos];
            }
        }
        return writePos+1;
    }
}

public class RemoveDuplicates{
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int result = s1.removeDuplicates(new int[]{0,0,1,1,1,2,2});
        System.out.println("Number of unique elements : "+result);
    }
}