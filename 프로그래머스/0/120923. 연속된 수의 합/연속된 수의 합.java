import java.util.stream.IntStream;
class Solution {
    public int[] solution(int num, int total) {
        int start = (total/num) - (num-1)/2;  
        
        return IntStream.range(start, start+num).toArray();

    }
}