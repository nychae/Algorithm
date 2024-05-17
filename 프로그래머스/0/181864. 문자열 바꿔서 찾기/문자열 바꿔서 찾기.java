class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        for(String s: myString.split("")) {
            answer += s.equals("A")? "B": "A";
        }
        return answer.contains(pat)? 1: 0;
    }
}