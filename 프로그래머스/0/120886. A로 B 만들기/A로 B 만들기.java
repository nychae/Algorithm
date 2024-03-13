import java.util.*;
class Solution {
    public int solution(String before, String after) {
        String[] afterArr = after.split("");

        for(int i=0;i<afterArr.length;i++) {
            before = before.replaceFirst(afterArr[i], "");
        }
        
        return before.equals("") == true? 1: 0;
    }
}