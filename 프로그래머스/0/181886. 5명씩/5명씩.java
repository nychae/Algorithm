import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        List<String> answer = new ArrayList();
        answer.add(names[0]);
        
        for(int i=1;(i*5)<names.length;i+=1) {
            answer.add(names[i*5]);
        }
        
        return answer.toArray(new String[0]);
    }
}