import java.util.*;
class Solution {
    public int[] solution(int[] arr, int n) {
        int arrLength = arr.length;
        int[] answer = Arrays.copyOf(arr, arrLength);
        
        for(int i=arrLength%2==0? 1: 0;i<arrLength;i+=2) {
            answer[i] += n;
        }
        
        return answer;
    }
}