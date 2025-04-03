class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] strArr = new String[my_string.length() / m];
        
        for(int i=0;i<my_string.length();i++) {
            int index = i/m;
            if(strArr[index] == null) strArr[index] = "";
            strArr[i/m] += my_string.charAt(i);
        }
        
        for(String s: strArr) {
            answer += s.charAt(c-1);
        }
        
        return answer;
    }
}