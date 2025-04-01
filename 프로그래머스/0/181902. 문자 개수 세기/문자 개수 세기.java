class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(char ch: my_string.toCharArray()) {
            int ascii = ch;
            if(ascii >= 65 && ascii <= 90) {
                answer[ascii-65]+=1;
            } else {
                answer[ascii-71]+=1;
            }
        }
        return answer;
    }
}