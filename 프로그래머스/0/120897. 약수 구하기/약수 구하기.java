import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Set<Integer> answerList = new HashSet<>();
        
        for(int i=1;i<=n;i++) {
            if(n % i == 0) answerList.add(i);
        }
        return answerList.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}