import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
       int[] answer = {};
        List<Double> scoreList = new ArrayList();
        List<Integer> rankList = new ArrayList();

        for(int[] sc: score) {
            scoreList.add((sc[0] + sc[1]) / 2.0);
            rankList.add(1);
        }

        int[] rank = rankList.stream().mapToInt(Integer::intValue).toArray();
        double[] scores = scoreList.stream().mapToDouble(Double::floatValue).toArray();
        for(int i=0;i<scores.length;i++) {
            for(int j=0;j<scores.length;j++) {
                if(i != j && scores[i] < scores[j]) {
                    rank[i]++;
                }
            }
        }

        return rank;
    }
}