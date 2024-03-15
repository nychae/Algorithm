class Solution {
    public int solution(String my_string) {
        String[] strArr = my_string.split(" ");
        int answer = Integer.parseInt(strArr[0]);
        
        for(int i=2;i<strArr.length;i++) {
            if(strArr[i].equals("+") || strArr[i].equals("-")) continue;
            
            if(strArr[i-1].equals("+")) {
                answer += Integer.parseInt(strArr[i]);
            } else if(strArr[i-1].equals("-")) {
                answer -= Integer.parseInt(strArr[i]);
            }
        }
        
        return answer;
    }
}