class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int number = 0;
        int count = 0;
        
        while(count <= Math.ceil(n/2)) {
            for(int i=count;i<n-count;i++) {
                answer[count][i] = ++number;
            }
                
            for(int i=count+1;i<n-count;i++) {
                answer[i][n-count-1] = ++number;
            }
            
            for(int i=n-count-2;i>=count;i--) {
                answer[n-count-1][i] = ++number;
            }
            
            for(int i=n-count-2;i>count;i--) {
                answer[i][count] = ++number;
            }
  
            count++;
        }
        
        return answer;
    }
}