package boj.p1535_안녕;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1535 {
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

        int joy = 0;
        int health = 100;

        //최대 N번 인사를 하면서 and 체력은 0 초과 이면서 , 기쁜은 최대화 하기.
        //dp -> x
        //greedy
        int cnt = 0;
        boolean[] used = new boolean[N];

        while(cnt < N){
            int mxJoy = 0;
            int mxIdx = 0;
            for(int i = 0; i < N; i++){
                if((J[i] >= mxJoy) && !used[i]){
                    mxJoy = J[i];
                    mxIdx = i;
//                    System.out.print("mx 값 update 중 : " + J[i] + " used 값 : " + used[i]);
                }
            }
            used[mxIdx] = true;
            System.out.println();
            joy += J[mxIdx];
            health -= L[mxIdx];
            System.out.println("현재 가장 joy가 큰 idx : " + mxIdx + " joy값 : " + joy + " health 값 : " + health);
            if(health <= 0){
                joy -= J[mxIdx];
                health += L[mxIdx];
            }

            cnt++;
        }


        System.out.println(joy);
    }
}
