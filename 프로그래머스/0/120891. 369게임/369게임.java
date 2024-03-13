import java.util.*;
class Solution {
    public int solution(int order) {
        return (int) Arrays.stream(String.valueOf(order).split(""))
                .filter(num -> num.equals("3") || num.contains("6") || num.contains("9")).count();
    }
}