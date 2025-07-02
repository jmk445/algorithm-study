package boj.p1780_종이의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1780 {
    static int sameCnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] map = new int[N][N];

        sameCnt = 0;
        recursion(map, N, 1);
        System.out.println(sameCnt);
        sameCnt = 0;
        recursion(map, N, 0);
        System.out.println(sameCnt);
        sameCnt = 0;
        recursion(map, N, -1);
        System.out.println(sameCnt);

    }

    static void recursion(int[][] map, int N, int target){
        if(allSame(map)){
            if(target == map[0][0]){
                sameCnt++;
            }
            return;
        }

        int[][] newMap = new int[N/3][N/3];
        for(int i = 0; i < map.length;i ++){
            int[] newLine = new int[N/3];
            for(int j = 0; j < map[i].length; j++){
//                newMap[i][j] =
                if(j%3 == 0){
//                    newLine[i] =
                }
            }

        }
//        recursion();



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
