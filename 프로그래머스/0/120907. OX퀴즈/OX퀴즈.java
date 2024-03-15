import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        List<String> answerList = new ArrayList<>();
        for(String q: quiz) {
            String[] quizArr = q.split(" ");
            int a = Integer.parseInt(quizArr[0]);
            int b = Integer.parseInt(quizArr[2]);
            int result = quizArr[1].equals("+")? a + b: a - b;

            answerList.add(result == Integer.parseInt(quizArr[4])? "O": "X");
        }
        return answerList.toArray(new String[answerList.size()]);
    }
}