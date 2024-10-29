import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<String> answerList = new ArrayList<>(Arrays.asList(myString.split("x")));

        if(myString.endsWith("x")) {
            answerList.add("");
        }
        return answerList.stream().mapToInt(String::length).toArray();
    }
}