class Solution {
    public String solution(String my_string, int[][] queries) {
        
        for(int[] query: queries) {
            String reversed = new StringBuilder(my_string.substring(query[0], query[1] + 1)).reverse().toString();
            my_string = my_string.substring(0, query[0])
                + reversed
                + my_string.substring(query[1]+1);
        }
        
        return my_string;
    }
}