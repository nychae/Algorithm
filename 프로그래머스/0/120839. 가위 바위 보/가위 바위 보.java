import java.util.*;
class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        List<String> winList = List.of("2","0","5");

        for(char c: rsp.toCharArray()) {
            int index = winList.indexOf(Character.toString(c));
            index = index == winList.size()-1? 0: index + 1;
            answer.append(winList.get(index));
        }


        return answer.toString();
    }
}