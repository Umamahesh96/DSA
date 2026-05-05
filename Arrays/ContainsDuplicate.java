import java.util.*;

//Brute force
class BruteForce{
    public boolean solution(int[] array){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]==array[j]){
                    return true;
            }
        }
    }return false;
}
}


class Sorting{
    public boolean solution(int[] array){
        Arrays.sort(array);
        for(int i=1; i<array.length; i++){
            if(array[i]==array[i-1]){
                return true;
            }
        }return false;
    }
}

class Hashing{
    public boolean ContainsDuplicate(int[] nums){
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)) return true;
            seen.add(num);
        }
        return false;
    }
}
class HashingLength{
    public boolean containsDuplicate(int[] nums){
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}


public class ContainsDuplicate {
    public static void main(String[] args) {
        // BruteForce bf = new BruteForce();
        // boolean answer = bf.solution(new int[]{1,2,3,3});
        // System.out.println(answer);

        // Sorting sort = new Sorting();
        // boolean answer = sort.solution(new int[]{1,8,2,1,3});
        // System.out.println(answer);

        Hashing obj_hashing = new Hashing();
        boolean answer = obj_hashing.ContainsDuplicate(new int[]{1,2,3,3});
        System.out.println(answer);
    }
}
