class Solution {
    public int solution(int[] numbers) {
        int answer = numbers[0] * numbers[1];

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1;j<numbers.length;j++) {
                int multi = numbers[i] * numbers[j];
                answer = multi >= answer? multi: answer;
            }
        }
        return answer;
    }
}