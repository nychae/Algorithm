import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int minIndex = -1;
        int maxIndex = -1;
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 2) {
                minIndex = i;
                break;
            }
        }
        
        for(int i=arr.length-1;i>=0;i--) {
            if(arr[i] == 2) {
                maxIndex = i;
                break;
            }
        }
        
        if(minIndex == -1 && maxIndex == -1) {
            return new int[]{-1};
        } else {
            return Arrays.copyOfRange(arr, minIndex, maxIndex + 1);
        }
    }
}