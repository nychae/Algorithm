class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while(true) {
            int sameValue = 0;
        
            for(int i=0; i<arr.length; i++) {
                int result = 0;
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    result = arr[i] / 2;
                } else if(arr[i] < 50 && arr[i] % 2 == 1) {
                    result = arr[i] * 2 + 1;
                }
                
                if(result == arr[i]) sameValue+=1;
                
                arr[i] = result;
            }
            
            if(sameValue == arr.length) return --answer;
            
            answer += 1;
        }
        
    }
}