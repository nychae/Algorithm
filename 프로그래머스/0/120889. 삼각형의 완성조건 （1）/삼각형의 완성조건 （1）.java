import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int[] sortedArr = Arrays.stream(sides).sorted().toArray();
        
        return sortedArr[0] + sortedArr[1] > sortedArr[2]? 1: 2;
    }
}