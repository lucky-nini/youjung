import java.io.*;
import java.util.*;

public class Main {
    static int V, E;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        int[][] edges = new int[E][3];
        parent = new int[V + 1];

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            edges[i][0] = Integer.parseInt(st.nextToken());
            edges[i][1] = Integer.parseInt(st.nextToken());
            edges[i][2] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(edges, Comparator.comparingInt(o -> o[2]));

        makeset();

        int totalCost = 0;
        int maxCost = 0;
        int edgeCount = 0;

        for (int i = 0; i < E; i++) {
            if (union(edges[i][0], edges[i][1])) { 
                totalCost += edges[i][2];
                maxCost = edges[i][2]; 
                edgeCount++;
                if (edgeCount == V - 1) break; 
            }
        }

        System.out.println(totalCost - maxCost);
    }

    static void makeset() {
        for (int i = 1; i <= V; i++) {
            parent[i] = i;
        }
    }

    static int findset(int a) {
        if (parent[a] == a) {
            return a;
        } else {
            return parent[a] = findset(parent[a]); // 경로 압축
        }
    }

    static boolean union(int a, int b) {
        int aRoot = findset(a);
        int bRoot = findset(b);

        if (aRoot != bRoot) {
            parent[bRoot] = aRoot;
            return true;
        }

        return false;
    }
}