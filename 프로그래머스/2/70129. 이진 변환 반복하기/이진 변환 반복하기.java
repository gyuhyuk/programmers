import java.util.*;

class Solution {
    public int[] solution(String s) {
        int countChange = 0;
        int countZero = 0;
        
        while(!s.equals("1")) {
            int beforeLength = s.length();
            
            s = s.replace("0", "");
            countZero += beforeLength - s.length();
            
            s = Integer.toBinaryString(s.length());
            countChange++;
        }
        
        return new int[]{countChange, countZero};
    }
}