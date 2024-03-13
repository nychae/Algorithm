import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String findNum = String.valueOf(k);
        for(int num=i;num<=j;num++) {
            answer += Arrays.stream(String.valueOf(num).split("")).filter(str -> str.equals(findNum)).count();
        }
        return answer;
    }
}