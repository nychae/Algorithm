import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = {};

        List<Integer> result = new ArrayList<>();
        List<Integer> sortedList = Arrays.stream(emergency).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for(int num: emergency) {
            result.add(sortedList.indexOf(num) + 1);

        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}