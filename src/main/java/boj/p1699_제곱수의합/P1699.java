package boj.p1699_제곱수의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //1. dp -> 점화식을 생각할 수가 없음
        //2. greedy
        //      - 최대한 큰, 제곱 수들의 합부터 나눠야함.
        //          ex) 13 -> 9 + 4
        //              9  -> 9
        //3. 다시 dp
        //      - 1 ~ N
        //      - 각각을 만드는데 최소한의 갯수를 저장하면서 감
        //      - how ? : 앞에 항에서
        //      - 1 ~ N 사이의 제곱수를 알고 있다고 하면
        //      -

        int[] dp = new int[N + 1];
        for(int i = 1; i <= N; i++){
            dp[i] = i;
            for(int j = 0; j * j <= i; j++){
                //1부터 N까지 모든 수마다
                //최소의 항의 개수를 구하면서 올라간다.
                //구하는 방법은 연쇄적으로 점화적으로 일어난다.
                //자기자신에서 어떤 한 제곱수를 뺐을 때, 남은 양(==i-j*j)을 채우는데 최소의 항을 구하고(dp[i-j*j]) 그러고 맨처음에 뺀 한 제곱수가 더해져야하니 +1을 해주면 i까지의 최소항이 된다.
                dp[i] = Math.min(dp[i],dp[i-j*j] + 1) ;
            }
        }

        System.out.println(dp[N]);

    }
}
