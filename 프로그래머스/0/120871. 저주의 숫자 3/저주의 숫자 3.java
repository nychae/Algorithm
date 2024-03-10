class Solution {
    public int solution(int n) {
        int answer = 0;
 
        for(int i=0;i<n;i++) {
            answer++;
            
            if(answer%3 == 0 || Integer.toString(answer).indexOf("3") >= 0) {
                i--;
            }
        }
        
        return answer;
    }
}