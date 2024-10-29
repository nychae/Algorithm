import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String[] solution(String myString) {
        List<String> stringList = Arrays.asList(myString.split("x")).stream().filter(s -> s.length() > 0).collect(Collectors.toList());
        stringList.sort(String::compareTo);
        return stringList.toArray(new String[0]);
    }
}