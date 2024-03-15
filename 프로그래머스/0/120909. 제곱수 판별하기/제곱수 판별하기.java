import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 1;
        Set<Integer> set = new HashSet<>();
        
        for(int i=1;i<=n;i++) {
            if(n%i == 0) set.add(i);
        }
         
        return set.size() % 2 == 1? 1: 2;
    }
}