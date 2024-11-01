import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        Queue<int[]> queue = new LinkedList<>();
        Queue<int[]> resultQueue = new LinkedList<>();
        
        for(int i=0;i< priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]});
        }
        
        while(!queue.isEmpty()) {
            int[] values = queue.peek();
            
            int maxValue = values[1];
            for(int[] q: queue) {
                if(maxValue < q[1]) maxValue = q[1]; 
            }
            
            if(maxValue == values[1]) {
                resultQueue.add(values);
                queue.remove();
            } else {
                queue.add(queue.remove());
            }
        }
        
        for(int[] q: resultQueue) {
            if(q[0] == location) return answer;
            answer++;
        }
        
        return answer;
    }
}