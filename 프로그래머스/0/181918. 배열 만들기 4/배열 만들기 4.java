import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
  
        while(i < arr.length) {
            if(stack.size() == 0) {
                stack.push(arr[i]);
                i+=1;
                continue;
            }
            int lastNum = stack.peek();
            
            if(lastNum >= arr[i]) {
                stack.pop();
            }else {
                stack.push(arr[i]);
                i+=1;
            }
        }
        
        int[] stk = new int[stack.size()];
        
        for(int j=stack.size()-1;j>=0;j--) {
            stk[j] = stack.pop();
        }
        
        return stk;
    }
}