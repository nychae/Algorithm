import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList();
        
        answerList.add(n);
        while (n != 1) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            
            answerList.add(n);
        }
        
        answer = new int[answerList.size()];
        for(int i=0;i<answerList.size();i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}