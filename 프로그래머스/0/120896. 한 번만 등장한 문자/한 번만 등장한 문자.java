import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        return Arrays.stream(s.split("")).distinct().filter(c -> s.indexOf(c) == s.lastIndexOf(c)).sorted().collect(Collectors.joining());
    }
}