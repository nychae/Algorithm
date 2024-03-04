class Solution {
    public int solution(int n) {
        int answer = 1;
        int sum = 1;
        
        while(true) {
            sum *= answer;
            if(sum > n) {
                return answer - 1;
            }
            answer++;
        }
        
    }
}