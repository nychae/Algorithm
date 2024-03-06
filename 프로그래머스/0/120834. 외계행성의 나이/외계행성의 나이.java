class Solution {
    public String solution(int age) {
        String ageStr = Integer.toString(age);

        StringBuilder sb = new StringBuilder();
        for(char c: ageStr.toCharArray()) {
            sb.append((char)(Character.getNumericValue(c) + 97));
        }

        return sb.toString();
    }
}