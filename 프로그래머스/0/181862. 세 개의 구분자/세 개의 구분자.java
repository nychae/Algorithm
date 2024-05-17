import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String[] solution(String myStr) {
        String[] strArr = myStr.split("");
        Stack<String> stk = new Stack();

        for(int i=0;i<strArr.length;i++) {
            if(strArr[i].equals("a") || strArr[i].equals("b") || strArr[i].equals("c")) {
                if(!stk.isEmpty() && !stk.peek().equals(",")) stk.push(",");
            } else {
                stk.push(strArr[i]);
            }
        }

        if(stk.size() == 0 || stk.toString().equals(",") ) {
            return new String[] {"EMPTY"};
        } else {
            return stk.stream().collect(Collectors.joining("")).split(",");
        }
    }
}