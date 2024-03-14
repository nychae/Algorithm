import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        answer[1] = 0;
        
        for(int i=0;i<array.length;i++) {
            if(answer[0] < array[i]) {
                answer[1] = i;
                answer[0] = array[i];
            }
        }
        
        return answer;
    }
}