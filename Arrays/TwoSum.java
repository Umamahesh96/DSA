import java.util.*;

class HashMap_Approach{
    public int[] solution(int[] nums, int target){
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            int diff = target - num;
            if(prevMap.containsKey(diff)){
                return new int[]{prevMap.get(diff), i};
            }
            prevMap.put(num, i);
        }
        return new int[0];
    }
}

public class TwoSum {
    public static void main(String[] args) {
        HashMap_Approach obj = new HashMap_Approach();
        obj.solution(new int[]{1,2,3,4}, 7);
    }
}
