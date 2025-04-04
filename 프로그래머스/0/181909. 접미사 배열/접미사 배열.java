import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> suffixList = new ArrayList();
        for(int i=my_string.length()-1;i>=0;i--) {
            suffixList.add(my_string.substring(i));
        }
        
        return suffixList.stream().sorted().toArray(String[]::new);
    }
}