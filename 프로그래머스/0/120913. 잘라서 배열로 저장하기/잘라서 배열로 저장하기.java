import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        List<String> list = new ArrayList();
        
        for(int i=0;i<my_str.length();i+=n) {
            int end = i + n;
            if(end >= my_str.length()) {
                list.add(my_str.substring(i));
            } else {
                list.add(my_str.substring(i, end));    
            }
            
        }
        return list.toArray(new String[list.size()]);
    }
}