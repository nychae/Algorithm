class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        return my_string.replaceAll(alp, alp.toUpperCase());
    }
}