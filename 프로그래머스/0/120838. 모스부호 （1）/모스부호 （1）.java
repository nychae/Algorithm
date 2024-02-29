import java.util.*;
class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letterArr = letter.split(" ");

        List<String> mosList = Arrays.asList(mos);

        for(String str : letterArr) {
            int index = mosList.indexOf(str) + 97;
            answer.append(Character.toString(index));
        }

        return answer.toString();
    }
}