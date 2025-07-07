package boj.p1780_종이의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P1780 {
    static int sameCnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] map = new int[N][N];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j ++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        sameCnt = 0;
        recursion(map, N, -1);
        System.out.println(sameCnt);
        sameCnt = 0;
        recursion(map, N, 0);
        System.out.println(sameCnt);
        sameCnt = 0;
        recursion(map, N, 1);
        System.out.println(sameCnt);

    }

    static void recursion(int[][] map, int N, int target){
        if(allSame(map)){
            if(target == map[0][0]){
                sameCnt++;
            }
            return;
        }
        int splitLength = N/3;
        List<int[][]> splitedMaps = new ArrayList<int[][]>();
        for(int i = 0; i < 9;i ++){
            int[][] splited = new int[splitLength][splitLength];
            splitedMaps.add(splited);
        }
        int[][] splited = new int[splitLength][splitLength];

        for(int i = 0; i < map.length; i ++){
            for(int j = 0; j < map[i].length; j++){
                splitedMaps.get(j/splitLength + i/splitLength * 3) [i%splitLength][j%splitLength] = map[i][j];
            }
        }

        for(int i = 0; i < splitedMaps.size(); i++){
            recursion(splitedMaps.get(i),N/3,target);
        }
    }
    static boolean allSame(int[][] map){
        int prev = map[0][0];
        for(int i = 0 ; i < map.length;i ++){
            for(int j = 0 ; j < map[i].length; j++){
                if(prev != map[i][j]){
                    return false;
                }
                prev = map[i][j];
            }
        }
        return true;
    }
}
