package boj.p1535_안녕;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1535_3_gpt_정답_냅색dp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] J = new int[N];
        int[] L = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            L[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            J[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[101]; //0 : dummy
        for(int i = 0; i < N;i++){
            for(int h = 100; h >= L[i]; h--){
                dp[h] = Math.max(dp[h],dp[h-L[i]] + J[i]);
            }
        }
        int max = 0;
        for(int i = 0; i <= 100; i++){
            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}
