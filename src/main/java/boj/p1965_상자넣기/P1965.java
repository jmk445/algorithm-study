package boj.p1965_상자넣기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P1965 {
    static int[] sizes;
    static int[] cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        sizes = new int[N];
        for(int i = 0; i < N; i++){
            sizes[i] = Integer.parseInt(st.nextToken());
        }

        //1.greedy
        //2. 항상 최대의 개수로 가지는 조합을 가지고, 거기서
//        8
//        1 6 2 5 7 3 5 6
//          2 2 3 4 3 4 5
        cnt = new int[N];
        for(int i = 0; i < cnt.length;i++){
            cnt[i] = 1;
        }
        int cntMax = 0;
        for(int i = 1; i < N; i++){
            cnt[i] = getBiggest(i)+1;//앞에서 자기보다 작은 거 중에 cnt가 가장 큰거 + 1;
            cntMax = Integer.max(cntMax, cnt[i]);
//            System.out.println(cntMax +" " + sizes[i]);
        }


        System.out.println(cntMax);

    }
    private static int getBiggest(int idx){
        //가장 많이 가지고 있으면서, sizes[idx] 보다는 작은거
        // sizes[0~idx]중 sizes[idx] 보다 작은것들 중에, cnt가 가장 큰거의 cnt값
        int cntMax = 0;
        for(int i = 0;i < idx; i++){
            if(sizes[i] < sizes[idx]){
                cntMax = Integer.max(cntMax,cnt[i]);
            }
        }
        return cntMax;
    }
}
