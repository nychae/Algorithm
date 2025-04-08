class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        
        for(int num: num_list) {
            mul *= num;
            sum += num;
        }
        
        return (sum*sum) > mul? 1: 0;
    }
}