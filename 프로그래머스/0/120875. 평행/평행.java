import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[][] setArr = {{0,1}, {0,2}, {0,3}, {1,2}, {1,3}, {2,3}};
        
        for(int i=0; i<setArr.length / 2; i++) {
            int[] set1 = setArr[i];
            int[] set2 = setArr[setArr.length - (i+1)];
            
            double y1 = (double)dots[set1[1]][1] - dots[set1[0]][1];
            double x1 = (double)dots[set1[1]][0] - dots[set1[0]][0];
            
            double y2 = (double)dots[set2[1]][1] - dots[set2[0]][1];
            double x2 = (double)dots[set2[1]][0] - dots[set2[0]][0];
            
            if(y1/x1 == y2/x2) return 1;
        }
        
        return 0;
    }
}