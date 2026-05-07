
//Practice of getOrDefault() method
import java.util.*;


class FruitStand{
    public void inventoryCheck(){
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Apples", 50);
        inventory.put("Bananas", 100);

        int countApples = inventory.getOrDefault("Apples", 0);
        System.out.println("Apples Count in Inventory :"+countApples);

        int countOranges = inventory.getOrDefault("Oranges", 0);
        System.out.println("Oranges Count in Inventory :"+countOranges);

    }
}

class SortingApproach{
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }
}

class HashMapApproach{
    public boolean isAnagram(String s, String t){
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0)+1);
            countT.put(t.charAt(i), countS.getOrDefault(t.charAt(i), 0)+1);
        }
        return countS.equals(countT);
    }
}

class HashTable_Array{
    public boolean isAnagram(String s, String t){
        int[] alphabetArray = new int[26];
        for(int i= 0; i<s.length(); i++){
            alphabetArray[s.charAt(i) - 'a']++;
            alphabetArray[t.charAt(i) - 'a']--;
        }
        for(int num : alphabetArray){
            if(num != 0){
                return false;
            }
        }return true;
    }
}

public class ValidAnagram {
    public static void main(String[] args) {
        // FruitStand obj = new FruitStand();
        // obj.inventoryCheck();
        HashTable_Array obj = new HashTable_Array();
        boolean answer = obj.isAnagram("cat", "act");
        System.out.println(answer);
    }
}
