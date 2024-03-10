import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;

        for (String str : dic) {
            String[] strArr = str.split("");
            int result = 0;
            for (String sp : spell) {
                if (Arrays.stream(strArr).anyMatch(s -> s.equals(sp))) result++;
            }

            if (result == spell.length) return 1;
        }

        return 2;
    }
}