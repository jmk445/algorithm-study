package boj.p1793_타일링;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class P1793 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> inputs = new ArrayList<>();
        int maxN = Integer.MIN_VALUE;
        while(true){
            String n = br.readLine();
            if(n == null || n.trim().isEmpty()){
                break;
            }
            maxN = Integer.max(maxN, Integer.parseInt(n));
            inputs.add(Integer.parseInt(n));


        }

        BigInteger[] dp = new BigInteger[maxN+1]; //0-> dummy
        dp[0] = BigInteger.ONE;
        dp[1] = BigInteger.valueOf(1);
        dp[2] = BigInteger.valueOf(3);
        for(int i = 3 ; i <= maxN; i++){
            dp[i] = dp[i-1].add( dp[i-2].multiply(BigInteger.valueOf(2)));
        }

        for(int i = 0; i < inputs.size();i++){
            System.out.println(dp[inputs.get(i)]);
        }

    }
}
