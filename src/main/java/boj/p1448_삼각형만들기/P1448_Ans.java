package boj.p1448_삼각형만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1448_Ans {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(arr[0]);
        queue.offer(arr[1]);
        queue.offer(arr[2]);

        for(int i = 0; i < N - 2; i++){
            int b1 = queue.peek();
            int b2 = queue.peek();
            int b3 = queue.peek();

            if(b1 < b2 + b3){
                System.out.println(b1+b2+b3);
                return;
            }

            queue.offer(arr[i]);
            queue.offer(arr[i+1]);
            queue.offer(arr[i+2]);
        }

    }
}
