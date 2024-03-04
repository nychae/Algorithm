class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] alphabet = {"a", "e", "i", "o", "u"};
        
        for(String a: alphabet) {
            my_string = my_string.replaceAll(a, "");
        }
        
        return my_string;
    }
}