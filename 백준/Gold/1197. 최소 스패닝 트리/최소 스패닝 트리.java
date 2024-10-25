import java.io.*;
import java.util.*;

public class Main {
    static int V;
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        int[][] edges = new int[E][3];
        parent = new int[V+1];

        for(int i = 0; i<E; i++){
            st = new StringTokenizer(br.readLine());
            edges[i][0] = Integer.parseInt(st.nextToken());
            edges[i][1] = Integer.parseInt(st.nextToken());
            edges[i][2] = Integer.parseInt(st.nextToken());
        }

        //정렬하기
        Arrays.sort(edges, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2]-o2[2];
            }
        });

        makeset();

        int dist = 0;
        int num = 0;

        for(int i = 0; i<E; i++){
            if(union(edges[i][0], edges[i][1])){//성공하면
                dist+= edges[i][2];
                num++;
                if(num == V-1) break;
            }
        }

        System.out.println(dist);
    }
    //makeset
    static void makeset(){
        for(int i = 1; i<=V; i++){
            parent[i] = i;
        }
    }

    //findset
    static int findset(int a){
        if(parent[a] == a){
            return a;
        }else{
            return parent[a] = findset(parent[a]);
        }
    }

    //union
    static boolean union(int a, int b){
        int aRoot = findset(a);
        int bRoot = findset(b);

        if(aRoot != bRoot){
            parent[bRoot] = aRoot;
            return true;
        }

        return false;
    }
}