import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<Integer>();
        int i = 2;
        while(n > 1) {
            if(n%i == 0) {
                for(int j=2;j<i;j++) {
                    if(i%j == 0) break;
                }

                n/=i;
                answerList.add(i);
            } else {
                i++;
            }

        }

        return answerList.stream().distinct().mapToInt(value -> value).toArray();
    }
}