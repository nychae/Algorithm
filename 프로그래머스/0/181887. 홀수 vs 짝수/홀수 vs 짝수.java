class Solution {
    public int solution(int[] num_list) {
        int[] answer = new int[2];
        
        for(int i=0;i<num_list.length;i+=1) {
            answer[i%2] += num_list[i];
        }
        
        return Math.max(answer[0], answer[1]);
    }
}