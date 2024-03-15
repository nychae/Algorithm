import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int num: array) {
            answer += Arrays.stream(String.valueOf(num).split("")).filter(n -> n.equals("7")).count();
        }
        return answer;
    }
}