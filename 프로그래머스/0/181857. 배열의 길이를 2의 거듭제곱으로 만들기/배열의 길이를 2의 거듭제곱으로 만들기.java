import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int length = 1;
        
        while(true) {
            if(arr.length <= length) {
                int[] answer = new int[length];
                for(int i=0;i<arr.length;i++) {
                    answer[i] = arr[i];
                }
                return answer;
            }
            
            length *= 2;
        }
        
    }
}