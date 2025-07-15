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

        for(int i = 0; i < N; i++){
            //합을 만드는 조합
        }


    }
}
