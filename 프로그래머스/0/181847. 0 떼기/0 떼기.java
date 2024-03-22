class Solution {
    public String solution(String n_str) {
        String answer = "";
        char[] charArr = n_str.toCharArray();
        
        for(int i=0;i<n_str.length();i++) {
            if(charArr[i] != '0') {
                answer = n_str.substring(i);
                break;
            }
        }
        
        return answer;
    }
}