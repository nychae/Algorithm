import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        int last = num_list[num_list.length - 1];
        int secondLast = num_list[num_list.length - 2];
        
        if(last > secondLast) {
            answer[num_list.length] = last - secondLast;
        } else {
            answer[num_list.length] = last * 2;
        }
        
        return answer;
    }
}