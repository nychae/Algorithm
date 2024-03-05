import java.util.*;
class Solution {
    public String solution(String polynomial) {
        StringBuilder answer = new StringBuilder();
        int x = 0;
        int value = 0;
        for(String str: polynomial.split(" \\+ ")) {
            if(str.contains("x")) {
                String number = str.replace("x","");
                x += number.equals("")? 1: Integer.parseInt(number);
            } else {
                value += Integer.parseInt(str);
            }
        }

        if(x != 0) answer.append(x!=1? x + "x": "x");
        if(value != 0) {
            if(x != 0) answer.append(" + ");
            answer.append(value);
        }

        return answer.toString();
    }
}