import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> arrList = new ArrayList();
        
        for(int a: arr) {
            if(a % divisor == 0) {
                arrList.add(a);
            }
        }
        
        if(arrList.size() == 0) return new int[]{-1};
        
        int[] answer = new int[arrList.size()];
        
        for(int i=0;i<arrList.size();i++) {
            answer[i] = arrList.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}