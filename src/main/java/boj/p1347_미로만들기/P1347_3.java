package boj.p1347_미로만들기;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1347_3 {
    static int[] dy = {1, 0, -1, 0}; // 남, 서, 북, 동
    static int[] dx = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();

        int direction = 0; // 초기 방향: 남쪽
        int y = 0, x = 0; // 시작 좌표 (0, 0)
        List<int[]> path = new ArrayList<>();
        path.add(new int[]{y, x});

        for (char cmd : input) {
            switch (cmd){
                case 'R':
                    direction = (direction + 1) % 4;
                case 'L':
                    direction = (direction + 3) % 4;
                default:
                    x += dx[direction];
                    y += dy[direction];
                    path.add(new int[]{y,x});
            }
        }

        int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;


        for(int[] pos : path){
            minY = Math.min(minY, pos[0]);
            maxY = Math.max(maxY, pos[0]);
            minX = Math.min(minX, pos[1]);
            maxX = Math.max(maxX, pos[1]);

        }

        int height = maxY - minY + 1; //만들어야 하는 줄 수니까 +1이 맞다.
        int width = maxX - minX + 1;

        char[][] map = new char[height][width];

        for(char[] row : map){
            Arrays.fill(row,'#');
        }

        for(int[] pos : path){
            int py = pos[0] - minY; //minX, minY 는 무조건 0보다 작거나 같다.
            int px = pos[1] - minX;
            map[py][px] = '.';
        }

        for(char[] row : map){
            System.out.println(new String(row));
        }

    }
}

//        그러면 -minX, -minY 겠네? 출발점이
//
//
//        ChatGPT의 말:
//        맞아요! 정확하게 이해하셨어요. 👏
//
//        출발점 (0, 0)은 출력용 2차원 배열 상에서 다음과 같이 위치합니다:
//
//        출력 맵에서의 출발점 좌표 = (0 - minY, 0 - minX) → (-minY, -minX)
//
//        즉:
//
//        minY만큼 아래로 내려가고 (y축은 아래로 갈수록 증가)
//
//        minX만큼 오른쪽으로 이동합니다
//
//        예시로 다시 정리해보면:
//
//        java
//        복사
//        편집
//        int py = pos[0] - minY;
//        int px = pos[1] - minX;
//        여기서 pos[0] = 0, pos[1] = 0 이면,
//        출발점의 위치는 py = -minY, px = -minX가 되는 거죠.
//
//        정리하면 ✅
//
//        출발점 좌표는 (0, 0)
//
//        출력 맵에서는 (-minY, -minX)로 보정되어 위치함
