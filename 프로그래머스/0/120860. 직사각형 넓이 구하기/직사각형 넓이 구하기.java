import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();

        for(int i=0;i<dots.length;i++) {
            x.add(dots[i][0]);
            y.add(dots[i][1]);
        }
        int[] xArr = x.stream().mapToInt(Integer::intValue).toArray();
        int[] yArr = y.stream().mapToInt(Integer::intValue).toArray();


        return Math.abs(xArr[0] - xArr[1]) * Math.abs(yArr[0] - yArr[1]);
    }
}