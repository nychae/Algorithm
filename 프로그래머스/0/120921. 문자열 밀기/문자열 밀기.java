import java.util.*;
class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)) return 0;

        int aLength = A.length();
        for(int i=1;i<aLength;i++) {
            String result = A.substring(aLength-i, aLength) + A.substring(0, aLength - i);
            if(result.equals(B)) return i;
        }
        return -1;
    }
}