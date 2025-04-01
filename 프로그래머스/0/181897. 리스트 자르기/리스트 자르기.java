import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int startIdx = 0;
        int endIdx = num_list.length;
        
        switch(n) {
            case 1: 
                endIdx = slicer[1] + 1;
                break;
            case 2: 
                startIdx = slicer[0];
                break;
            case 3: 
                startIdx = slicer[0];
                endIdx = slicer[1] + 1;
                break;
            case 4:
                startIdx = slicer[0];
                endIdx = slicer[1] + 1;
                break;
        }
        
        
        answer = Arrays.copyOfRange(num_list, startIdx, endIdx);
        
        if(n == 4) {
            List<Integer> answerList = new ArrayList<>();
            
            for(int i=0;i<answer.length;i+=slicer[2]) {
                answerList.add(answer[i]);
            }
            
            return answerList.stream().mapToInt(i->i).toArray();
        } else {
            return answer;
        }
    }
}