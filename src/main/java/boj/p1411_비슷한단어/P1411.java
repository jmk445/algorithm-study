package boj.p1411_비슷한단어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P1411 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] pairs = new String[N];
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            pairs[i] = str;
        }

        for(int i = 0; i < N; i++){
            Map<Character,Character> map = new HashMap<>();
            for(int j = 0; j < pairs[i].length(); j++){
                if(!map.containsKey(pairs[i].charAt(j))){
                    map.put(pairs[i].charAt(j),(char)(pairs[i].charAt(j) - 'a'));
                }
                char c = pairs[i].charAt(j);
            }
        }
    }
}
