import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++) {
            int remain = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            queue.offer(remain);
        }
        
        while(!queue.isEmpty()) {
            int current = queue.poll();
            int count = 1;
           
            while(!queue.isEmpty() && queue.peek() <= current) {
                queue.poll();
                count++;
            }
            result.add(count);
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}