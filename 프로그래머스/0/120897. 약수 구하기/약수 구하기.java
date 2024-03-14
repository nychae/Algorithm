import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        
        for(int i=1;i<=n;i++) {
            if(n % i == 0) answerList.add(i);
        }
        return answerList.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}