package boj.p1706_크로스워드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
//                        System.out.println(word);
                        words.add(sb.toString());
                        sb = new StringBuilder();
                    }
                    else{
                        sb = new StringBuilder();
                    }
                }
            }
            if(sb.length() > 1){
                String word = sb.toString();
//                System.out.println(word);
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
//                        String word = sb.toString();
                        words.add(sb.toString());
                        sb = new StringBuilder();
                    }else{
                        sb = new StringBuilder();
                    }
                }
            }
            if( sb.length() > 1){
                String word = sb.toString();
//                System.out.println(word);
                words.add(word);
            }
            sb = new StringBuilder();

        }


        String answer = words.get(0);
        for(String word : words){
            if(isWord1SmmallerThanWord2(word,answer)){
                answer = word;
            }
        }
        System.out.println(answer);
    }

    private static boolean isWord1SmmallerThanWord2(String word1, String word2){
        //aab aac
        //앞자리에서 빠른게 나올 수록 빠르다.
        //첫번째 자리 비교, 같으면 두번째 자리비교, ...

        //길이가 다른 경우
        //길이가 같은 경우

        if(word1.length() < word2.length()){
            StringBuilder sb = new StringBuilder();
            sb.append(word1);
            for(int i = 0; i < (word2.length() - word1.length()); i++){
                sb.append(" ");
            }
            word1 = sb.toString();
        }else{
            StringBuilder sb = new StringBuilder();
            sb.append(word2);
            for(int i = 0; i < (word1.length() - word2.length()); i++){
                sb.append(" ");
            }
            word2 = sb.toString();
        }
//        for(int i = 0; i < word1.length() ; i++){
//            System.out.print(word1.toCharArray()[i] + " < "+  word2.toCharArray()[i] + " : ");
//            System.out.println(word1.toCharArray()[i] < word2.toCharArray()[i]);
//            if(word1.toCharArray()[i] < word2.toCharArray()[i]){
////                System.out.println(word1 +" is smaller than " + word2 + " because of this : " + word1.toCharArray()[i] + "is smaller than this char : " + word2.toCharArray()[i] + " idx : " + i);
//                return true;
//            }
//        }
        for(int i = 0; i < word1.length() ; i++){
            if(word1.toCharArray()[i] != word2.toCharArray()[i]){
                return word1.toCharArray()[i] < word2.toCharArray()[i];
            }
        }
        //여기까지 왔다는 것은 다 같다는 뜻
        return false;
    }
}
