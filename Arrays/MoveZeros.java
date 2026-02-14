//Brute Force with extra space(created another array)
// class MoveZeros{
//     void moveZeros(int[] nums){
//         int n = nums.length;
//         int[] result = new int[n];
//         int pointer = 0;

//         for(int i = 0; i < n; i++){
//             if(nums[i] != 0){
//                 result[pointer] = nums[i];
//                 pointer++;
//             }
//         }
//         for(;pointer<n;pointer++){
//             result[pointer] = 0;
//         }
//         System.arraycopy(0, 0, result, pointer, 5);
//     }
// }
// ---------------------------------------------------------------------------------
//Two-pass In-place 
// class MoveZeros{
//     void moveZeros(int[] nums){
//         int n = nums.length;
//         int writepos = 0;
//         //First-pass
//         for(int i = 0; i < n; i++){
//             if(nums[i] != 0){
//                 nums[writepos++] = nums[i];
//             }
//         }
//         //second-pass
//         while(writepos < n){
//             nums[writepos] = 0;
//         }
//     }
// }
// ---------------------------------------------------------------------------------
//Two-pointer with Swapping
public class MoveZeros {

    public void moveZeros(int[] nums) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                if (right != left) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
                left++;
            }
        }
    }
}
