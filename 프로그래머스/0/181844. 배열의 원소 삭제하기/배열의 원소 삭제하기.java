import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        for(int delete: delete_list) {
            Integer deleteNum = Integer.valueOf(delete);
            if(arrList.contains(deleteNum)) arrList.remove(deleteNum);
        }
        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}