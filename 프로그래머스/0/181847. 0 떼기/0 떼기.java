class Solution {
    public String solution(String n_str) {
        String answer = "";
        char[] charArr = n_str.toCharArray();
        
        for(int i=0;i<n_str.length();i++) {
            if(charArr[i] != '0') {
                return n_str.substring(i);
            }
        }
        
        return answer;
    }
}