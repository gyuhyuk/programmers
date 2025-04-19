import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        Queue<Integer> timeQueue = new LinkedList<>();

        int time = 0;
        int totalWeight = 0;
        int index = 0;

        while (index < truck_weights.length || !bridge.isEmpty()) {
            time++;

            // 다리를 지난 트럭 제거
            if (!timeQueue.isEmpty() && time - timeQueue.peek() >= bridge_length) {
                totalWeight -= bridge.poll();
                timeQueue.poll();
            }

            // 다음 트럭을 다리에 올릴 수 있으면
            if (index < truck_weights.length && totalWeight + truck_weights[index] <= weight) {
                bridge.offer(truck_weights[index]);
                timeQueue.offer(time);
                totalWeight += truck_weights[index];
                index++;
            }
        }

        return time;
    }
}
