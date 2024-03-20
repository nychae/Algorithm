import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        List<String> answerList = new ArrayList();
        
        for(String str: picture) {
            String line = "";
            String[] lines = str.split("");
            
            for(int i=0;i<lines.length;i++) {
                for(int j=0;j<k;j++) {
                    line += lines[i];
                }
            }
            
            for(int i=0;i<k;i++) {
                answerList.add(line);
            }
        }
        return answerList.toArray(new String[answerList.size()]);
    }
}