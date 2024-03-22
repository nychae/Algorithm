import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = Integer.MIN_VALUE;
        Map<Integer, Integer> lengthMap = new HashMap();
        
        for(String str: strArr) {
            int length = str.length();
        
            if(lengthMap.containsKey(length)) {
                int count = lengthMap.get(length);
                lengthMap.replace(length, ++count);
            } else {
                lengthMap.put(length, 1);
            }
        }
        
        for(int length: lengthMap.values()) {
            if(answer < length) answer = length;
        }
        
        return answer;
    }
}