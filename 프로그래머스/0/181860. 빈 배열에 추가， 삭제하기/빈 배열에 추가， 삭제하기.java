import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        Stack<Integer> stk = new Stack();
        
        for(int i=0;i<arr.length;i++) {
            if(flag[i]) {
                for(int n=0;n<arr[i] * 2;n++) {
                    stk.push(arr[i]);
                }
            } else {
                for(int n=0;n<arr[i];n++) {
                    stk.pop();
                }
            }
        }
        
        return stk.size() == 0? new int[]{}: stk.stream().mapToInt(Integer::intValue).toArray();
    }
}