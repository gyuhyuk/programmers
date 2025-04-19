class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        
        int index = 0;
        int max;
        for(int i=0; i<number.length()-k; i++) { 
            max = 0;
            for(int j=index; j<=i+k; j++) { 
                if(max < number.charAt(j)-'0') {
                    max = number.charAt(j)-'0';
                    index = j+1;
                    
                    if(max == 9) break;
                }
            }
            sb.append(max);
        }
        
        return sb.toString();
    }
}