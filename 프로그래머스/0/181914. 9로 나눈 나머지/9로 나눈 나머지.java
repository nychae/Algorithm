class Solution {
    public int solution(String number) {
        int sum = 0;
        for(String n: number.split("")) {
            sum += Integer.parseInt(n);
        }
        return sum % 9;
    }
}