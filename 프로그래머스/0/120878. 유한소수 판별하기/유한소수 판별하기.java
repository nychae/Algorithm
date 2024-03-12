import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        int min = Math.min(a, b);
        int max = 1;
        for(int i=2; i<=min; i++) {
            if(a % i == 0 && b % i == 0) {
                max = max < i? i: max;
            }
        }

        b /= max;

        while(b > 1) {
            if(b % 5 == 0) {
                b /= 5;
                continue;
            }

            if(b % 2 == 0) {
                b /= 2;
                continue;
            }
            return 2;
        }
       return 1;
    }
}