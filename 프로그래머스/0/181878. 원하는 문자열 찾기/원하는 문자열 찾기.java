class Solution {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().indexOf(pat.toLowerCase()) >= 0? 1: 0;
    }
}