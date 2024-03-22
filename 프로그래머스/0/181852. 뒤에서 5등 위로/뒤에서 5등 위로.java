import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        return Arrays.stream(num_list).boxed().sorted(Comparator.reverseOrder()).limit(num_list.length - 5).mapToInt(Integer::intValue).sorted().toArray();
    }
}