import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] before = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] after = Arrays.copyOfRange(num_list, 0, n);
        return IntStream.concat(Arrays.stream(before), Arrays.stream(after)).toArray();
    }
}