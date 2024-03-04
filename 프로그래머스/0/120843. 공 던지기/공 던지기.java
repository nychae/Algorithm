class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = k*2 - 2 >= numbers.length? (k*2 - 2) % numbers.length: k*2 -2;
        
        return numbers[index];
    }
}