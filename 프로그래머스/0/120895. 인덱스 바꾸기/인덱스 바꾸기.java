class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] strArr = my_string.split("");
        String str2 = strArr[num2];
        
        strArr[num2] = strArr[num1];
        strArr[num1] = str2;
        
        return String.join("",strArr);
    }
}