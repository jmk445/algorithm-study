package boj.p2304_창고다각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P2304 {

    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> sticks = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int firstStickLoc = Integer.MAX_VALUE,lastStickLoc = 0;
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int loc = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            firstStickLoc = Integer.min(firstStickLoc,loc);
            lastStickLoc = Integer.max(lastStickLoc,loc);
            sticks.put(loc,height);
        }

        int[] garage = new int[lastStickLoc+1];
        //올라갈때 => 자기보다 큰게 있을 떄 ㄱㄴ
        //내려갈때 => 오른쪽에서 제일 큰게 자기보다 작을 때
        int highest = 0;
        for(int i = 0; i <= lastStickLoc; i++){
            if(sticks.get(i) != null){
                garage[i] = sticks.get(i);
                highest = Integer.max(highest,garage[i]);
            }
        }
        int highestLoc = -1;
        for(int i = 0; i < garage.length; i++){
            if(i == highest) {
                highestLoc = i;
                break;
            }

        }
        int i = 0,j = Integer.MAX_VALUE;
        while(i < j){
            if(i < highestLoc){

            }

        }
    }
}
