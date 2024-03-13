class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;
        
        for(int num: array) {
            int distance = Math.abs(num-n);
            if(min > distance) {
                min = distance;
                answer = num;
            } else if(min == distance) {
                if(answer > num) answer = num;
            }
        }
        
        return answer;
    }
}