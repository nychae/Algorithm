import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int i = 0;
        Stack<Integer> stk = new Stack<>();
        
        while(i < arr.length) {
            if(stk.size() == 0) {
                stk.push(arr[i]);
            } else {
                if(stk.peek() == arr[i]) {
                    stk.pop();
                } else {
                    stk.push(arr[i]);
                }
            }
            
            i++;
        }
            
        return stk.size() == 0? new int[]{-1}: stk.stream().mapToInt(Integer::intValue).toArray();
    }
}