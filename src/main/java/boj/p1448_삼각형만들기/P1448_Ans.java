package boj.p1448_삼각형만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class P1448_Ans {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];
        for(int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr,(a,b)->Integer.compare(b,a));

//        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < N - 2; i++){

            if(arr[i] < arr[i+1] + arr[i+2]){
                System.out.println(arr[i]+arr[i+1]+arr[i+2]);
                return;
            }
        }

        System.out.println("-1");

    }
}
