package boj.p1706_크로스워드;

import java.io.*;
import java.util.*;

public class P1706_enhancedVersion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        char[][] map = new char[R][C];
        for (int i = 0; i < R; i++) {
            map[i] = br.readLine().toCharArray();
        }

        List<String> words = new ArrayList<>();
        extractWords(words, map, R, C);             // 가로
        extractWords(words, transpose(map, R, C), C, R); // 세로

        Collections.sort(words);
        System.out.println(words.get(0));
    }

    private static void extractWords(List<String> words, char[][] map, int R, int C) {
        for (int i = 0; i < R; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < C; j++) {
                if (map[i][j] != '#') {
                    sb.append(map[i][j]);
                } else {
                    if (sb.length() > 1) words.add(sb.toString());
                    sb.setLength(0); // StringBuilder 초기화
                }
            }
            if (sb.length() > 1) words.add(sb.toString());
        }
    }

    private static char[][] transpose(char[][] map, int R, int C) {
        char[][] transposed = new char[C][R];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                transposed[j][i] = map[i][j];
            }
        }
        return transposed;
    }
}

//핵심 정리

//compareTo()로 사전순 비교 가능
//
//StringBuilder.delete(x,x)는 무효
//
//동일한 반복 로직은 함수로 추출
//
//Collections.sort() 후 첫 번째 값이 사전순 가장 앞서는 단어
