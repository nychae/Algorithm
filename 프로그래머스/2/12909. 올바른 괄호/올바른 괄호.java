import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()) {
            if(stack.isEmpty()) {
                if(ch == ')') return false;
                stack.push(ch);
            } else {
                if(stack.peek() == ch) {
                    stack.push(ch);
                } else {
                    stack.pop();
                }
            }
        }

        return stack.size() == 0? true: false;

    }
}