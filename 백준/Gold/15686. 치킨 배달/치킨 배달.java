import java.io.*;
import java.util.*;

public class Main {
    static class Point{// 치킨가게 좌표
        public int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int N,M,len,answer = Integer.MAX_VALUE;
    static int[] combi;//조합
    static ArrayList<Point> shop, house;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        combi = new int[M];
        shop = new ArrayList<>();
        house = new ArrayList<>();

        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                int temp = sc.nextInt();
                if(temp == 1){
                    house.add(new Point(i,j));
                }else if(temp == 2){
                    shop.add(new Point(i,j));
                }
            }
        }

        len = shop.size();
        DFS(0,0);
        System.out.println(answer);
    }

    static void DFS(int L, int s){
        if(L == M){ 
            int sum = 0;
            for(Point h: house){
                int dis = Integer.MAX_VALUE;
                for(int i : combi){
                    dis = Math.min(dis,Math.abs(h.x - shop.get(i).x)+ Math.abs(h.y - shop.get(i).y));
                }
                sum+= dis;
            }
            answer = Math.min(answer, sum);
        }else{
            for(int i = s; i<len; i++){
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
}