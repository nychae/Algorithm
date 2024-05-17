import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        List<Integer> numList = new ArrayList();
        
        for(int a: arr) {
            if(numList.size() == k) break;
            if(numList.indexOf(a) < 0) {
                numList.add(a);
            }
        }
        
        if(k > numList.size()) {
            for(int i=numList.size();i<k;i++) {
                numList.add(-1);
            }    
        }
        
        return numList.stream().mapToInt(Integer::intValue).toArray();
    }
}