class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.toLowerCase().split(" ");
    
        for(int i=0; i<arr.length; i++) {
            if(!arr[i].isEmpty()) {
                sb.append(Character.toUpperCase(arr[i].charAt(0)));
                sb.append(arr[i].substring(1));
            }
            
            if(i < arr.length - 1) {
                sb.append(" ");
            }
        }
        if(s.charAt(s.length()-1) == ' ') {
                sb.append(" ");
            }
        
        return sb.toString();
    }
}