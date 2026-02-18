
import java.util.HashMap;

//Brute Force(Two for loops O(n2))
class Solution{
    public int majorityElement(int[] nums){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(nums[j] == nums[i]){
                    count++;
                }
            }
            //frequency check
            if(count > n/2){
                return nums[i];
            }
        }
        return -1;
    }
}

//Using HashMap TC - O(n), where as SC - O(n) because HashMap may store all unique elements
class Solution2{
    public int majorityElement(int[] nums){
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num) > n/2){
                return num;
            }
        }
        return -1;
    }
}

//Driver class
public class MajorityElement{
    public static void main(String[] args) {
        
    }
}