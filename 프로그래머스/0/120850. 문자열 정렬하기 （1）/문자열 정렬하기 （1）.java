import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        my_string = my_string.replaceAll("[^0-9]", "");
        return Arrays.asList(my_string.split("")).stream().mapToInt(Integer::parseInt).sorted().toArray();
    }
}