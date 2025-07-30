package boj.p1535_안녕;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1535_2 {
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

        List<Map> nodes = new ArrayList<>();
        for(int i = 0 ; i < N; i++){
            Map<Integer,Integer> node = new HashMap<>();
            node.put(L[i],J[i]);
            nodes.add(node);
        }


        Queue<Integer> queue = new PriorityQueue<>();
        while(!queue.isEmpty()){
            for(int i = 0;i < N; i++){
                queue.add(L[i]); //포함

            }
            for(int i = 0; i < N; i++){
//                queue.add();
            }
        }
//        첫번째거 포함 ->두번째꺼 포함
//                    ->두번째꺼 비포함->두번째꺼 포함
//                                  ->두번째꺼 비포함
//        첫번째거 비포함->두번째꺼 포함
//                    ->두번째꺼 비포함->두번째꺼 포함
//                                  ->두번째꺼 비포함
        int joy = 0;
        int health = 100;

        //최대 N번 인사를 하면서 and 체력은 0 초과 이면서 , 기쁜은 최대화 하기.
        //dp -> x
        //greedy -> x
        //넣었다가 뺐다가 를 반복하면서 이진
        //dp
        //두 사람에게 인사를 해서 얻을 수 있는 안죽으면서 얻는 최대의 기쁨 = 한 사람에게 인사를 해서 얻을 수 있는 안죽으면서 얻는 최대의 기쁨 +



        System.out.println(joy);
    }
}
