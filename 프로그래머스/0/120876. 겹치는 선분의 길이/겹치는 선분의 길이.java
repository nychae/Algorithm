import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        List<int[]> list = new ArrayList();
        List<int[]> dupl = new ArrayList();
        for(int i=0; i<lines.length; i++) {
            for(int j=lines[i][0];j<lines[i][1];j++) {
                int[] value = {j, j+1};
                if(list.stream().anyMatch(s -> Arrays.equals(s, value))) {
                    if(dupl.stream().noneMatch(s -> Arrays.equals(s, value))) {
                        dupl.add(value);
                    }
                }
                list.add(value);
            }
        }

        return dupl.size();
    }
}