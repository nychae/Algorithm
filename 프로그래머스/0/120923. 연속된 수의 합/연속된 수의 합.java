import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = {0};
        int start = total <= num? -1000: -total;
        for (int i = start; i <= total; i++) {
            int[] arr = IntStream.range(i, i + num).toArray();

            if (Arrays.stream(arr).sum() == total) return arr;

        }
        return answer;
    }
}