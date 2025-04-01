import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String[] strArr = my_string.split("");
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<strArr.length;i++) {
           if(indexOf(indices, i) == -1) {
               sb.append(strArr[i]);
           } 
        }
        
        return sb.toString();
    }
    
    public int indexOf(int[] arr, int value) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == value) return value;
        }
        return -1;
    }
}