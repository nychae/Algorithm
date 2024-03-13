class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        while(chicken > 9) {
            answer += chicken / 10;
            int restCoupon = chicken % 10;
            chicken /= 10;
            chicken += restCoupon;
        }
        
        return answer;
        
    }
}