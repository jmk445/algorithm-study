package boj.p1448_삼각형만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1448{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[N];



    }

    boolean isTriangle(int[] arr){
        int max = arr[0];
        int maxIdx = 0;
        for(int i = 0; i < arr.length;i++){
            max = Integer.max(max,arr[i]);

        }
        for(int i = 0; i < arr.length;i++){
            if(max == arr[i]){
                maxIdx = i;
                break;
            }
        }
        int sum = 0;
        for(int i = 0; i < arr.length;i++){
            if(i != maxIdx){
                sum += arr[i];
            }
        }

        return true;

    }
}
