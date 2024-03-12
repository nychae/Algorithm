import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        List<Integer> answerList = new ArrayList();
        
        int min = Math.min(a, b);
        int max = 1;
        for(int i=2; i<=min; i++) {
            if(a % i == 0 && b % i == 0) {
                max = max < i? i: max;
            }
        }
        
        b /= max;
        int i = 2;
        while(b > 1) {
            if(b%i == 0) {
                for(int j=2;j<i;j++) {
                    if(i%j == 0) break;
                }

                b/=i;
                answerList.add(i);
            } else {
                i++;
            }
        }
        
        return answerList.stream().allMatch(n -> n ==2 || n ==5)? 1: 2;
    }
}