import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] numbers = {a, b, c, d};
        Map<Integer, Integer> map = new HashMap();
        int p = 0, q = 0;
        
        for(int n: numbers) {
            if(map.containsKey(n)) {
                map.replace(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        
        if(map.containsValue(4)) {
            answer = 1111 * a;
        } else if(map.containsValue(3)) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue() == 3) {
                    p = entry.getKey();
                } else {
                    q = entry.getKey();
                }     
            }
            
            answer = (int)Math.pow(10 * p + q, 2);
        } else if(map.containsValue(2)) {
            if(map.containsValue(1)) {
                answer = 1;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if(entry.getValue() == 1) {
                        answer *= entry.getKey();
                    }
                }
            } else {
                List<Integer> list = new ArrayList();
                for(Integer key: map.keySet()) {
                    list.add(key);
                }
                answer = (list.get(0) + list.get(1)) * Math.abs(list.get(0) - list.get(1));
            }
            } else {
                Arrays.sort(numbers);
                answer = numbers[0];
            }
        
        
        return answer;
    }
}