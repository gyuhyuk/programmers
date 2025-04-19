import java.util.*;

class Solution {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int network = 0;

    public int solution(int n, int[][] computers) {
        A = new ArrayList[n];
        
        for (int i = 0; i < n; i++) {
            A[i] = new ArrayList<>();
        }

        visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && computers[i][j] == 1) {
                    A[i].add(j);
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                network++;
            }
        }
        
        return network;
    }

    static void dfs(int node) {
        visited[node] = true;

        for (int i : A[node]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}