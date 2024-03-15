import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] str = {"aya", "ye", "woo", "ma"};
        
        for(String ba: babbling) {
            for(String s: str) {
                ba = ba.replaceAll(s,"-");
            }
            if(ba.replaceAll("-","").length() == 0) answer++;
        }
        
        return answer;
    }
}