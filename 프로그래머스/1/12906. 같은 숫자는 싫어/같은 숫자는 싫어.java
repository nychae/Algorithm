import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        for(int num: arr) {
            if(answer.isEmpty() || !answer.get(answer.size() - 1).equals(num)) answer.add(num);
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}