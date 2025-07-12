package boj.p1706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class P1706 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() );
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char[][] map = new char[R][C];
        for(int i = 0; i < R; i++){
            map[i] = br.readLine().toCharArray();
        }
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < R; i++){
            for(int j = 0; j < C;j++){
                if(map[i][j] != '#'){
                    sb.append(map[i][j]);
                }else{
                    if(sb.length() > 1){
                        sb.delete(sb.length(), sb.length());
                        String word = sb.toString();
                        System.out.println(word);
                        words.add(sb.toString());
                        sb = new StringBuilder();
                    }
                    else{
                        sb = new StringBuilder();
                    }
                }
            }
            if(!sb.isEmpty() && sb.length() > 1){
                String word = sb.toString();
                System.out.println(word);
                words.add(word);
            }
            sb = new StringBuilder();

        }
        sb = new StringBuilder();
        for(int j = 0; j < C; j++){
            for(int i = 0; i < R;i++){
                if(map[i][j] != '#'){
                    sb.append(map[i][j]);
                }else{
                    if(sb.length() > 1){
                        sb.delete(sb.length(), sb.length());
                        String word = sb.toString();
                        System.out.println(word);
                        words.add(sb.toString());
                        sb = new StringBuilder();
                    }else{
                        sb = new StringBuilder();
                    }
                }
            }
            if(!sb.isEmpty() && sb.length() > 1){
                String word = sb.toString();
                System.out.println(word);
                words.add(word);
            }
            sb = new StringBuilder();

        }

        System.out.println(words.size());

        int r = words.size(),l = 0;
        while(l < r){
            int mid = (l+r)/2;
            if(dicCompare(words.get(l), words.get(mid))){
                mid = l;
            }else{
                r = mid;
            }
        }

    }
}
