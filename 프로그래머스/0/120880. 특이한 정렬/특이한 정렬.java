import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        Map<Integer, int[]> result = new HashMap<>();

        for(int num: numlist) {
            int key = Math.abs(n-num);

            result.merge(key, new int[]{num}, (v1, v2) -> {
                List<Integer> values = new ArrayList<>();
                for(int value: v1) {
                    values.add(value);
                }
                values.add(v2[0]);

                return values.stream().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
            });
        }

        result.keySet().stream().sorted().forEach(key -> {
            for(int num: Arrays.stream(result.get(key)).toArray()) {
                answerList.add(num);
            }
        });

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}