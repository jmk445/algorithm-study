package boj.p1965_상자넣기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P1965 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] sizes = new int[N];
        for(int i = 0; i < N; i++){
            sizes[i] = Integer.parseInt(st.nextToken());
        }

        //1.greedy
        //2. 항상 최대의 개수로 가지는 조합을 가지고, 거기서
//        8
//        1 6 2 5 7 3 5 6
//          2 2 3 4 3 4 5
        int[] cnt = new int[N-1];
        for(int i = 1; i < N; i++){
            cnt[i] = //앞에서 자기보다 작은 거 중에 cnt가 가장 큰거 + 1;
        }


    }
}
