package boj.p2725_보이는점의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Long[] dp = new Long[1000];
        dp[1] = 3L;
        dp[2] = 5L;
        int[] testCases = new int[T];
        int max = 0;
        for(int i = 0; i < T; i++){
            testCases[i] = Integer.parseInt(br.readLine());
            max = Integer.max(max,testCases[i]);
        }

        for(int i = 3; i <= max; i++){
            int serosoCnt =  0;
            for(int j = 0; j <  i; j++){
                if(gcd(i,j) == true){
                    serosoCnt++;
                }
            }
            dp[i] = dp[i-1] + serosoCnt * 2L;
        }

        for(int i = 0; i < T; i++){
            System.out.println(dp[testCases[i]]);
        }
    }

    public static boolean gcd(int x, int y) {
        if(y==0) return x==1;
        return gcd(y, x%y);
    } // g
}
