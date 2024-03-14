class Solution {
    public String solution(String cipher, int code) {
        String[] cipherArr = cipher.split("");
        StringBuilder answer = new StringBuilder();
        
        for(int i=0;i<cipherArr.length;i++) {
            if((i+1) % code == 0) answer.append(cipherArr[i]);
        }
        return answer.toString();
    }
}