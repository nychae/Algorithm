import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> clothesMap = new HashMap<>();

        for(String[] cloth: clothes) {
            clothesMap.put(cloth[1], clothesMap.getOrDefault(cloth[1], 0) + 1);
        }
        
        int valueSum = 1;

        for(String key : clothesMap.keySet()) {
            valueSum *= (clothesMap.get(key) + 1);
        }
        return valueSum - 1;
    }
}