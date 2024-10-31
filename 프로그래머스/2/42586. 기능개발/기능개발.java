import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> answer = new Stack<>();

        double beforeWork = Integer.MIN_VALUE;
        for(int i=0;i<progresses.length;i++) {
            double work = Math.ceil((double)(100 - progresses[i])/speeds[i]);
            if(answer.isEmpty() || beforeWork < work) {
                answer.push(1);
                beforeWork = work;
            } else {
                answer.push(answer.pop() + 1);
            }
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}