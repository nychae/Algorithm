import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> attendanceList = new ArrayList();
        List<Integer> rankList = Arrays.stream(rank).boxed().collect(Collectors.toList());
        
        for(int i=0;i<attendance.length;i++) {
            if(attendance[i]) attendanceList.add(rank[i]);
        }
        
        int[] rankArr = attendanceList.stream().sorted().limit(3).mapToInt(Integer::intValue).toArray();
        
    
        for(int i=0;i<3;i++) {
            rankArr[i] = rankList.indexOf(rankArr[i]);
        }
        
        return 10000 * rankArr[0] + 100 * rankArr[1] + rankArr[2];
        
    }
}