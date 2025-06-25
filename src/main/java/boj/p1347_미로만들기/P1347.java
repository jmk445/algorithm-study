package boj.p1347_미로만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1347 {
    int[] dy = {-1,0,1,0};
    int[] dx = {0,-1,0,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        char[] input = br.readLine().toCharArray();
        int direction = 0;
        List<Integer> valid = new ArrayList<>();
        for(int i = 0; i < N; i ++){
            switch (input[i]){
                case 'R':
                    direction %= 4;
                    direction ++;
                    break;
                case 'L':
                    direction %= 4;
                    direction --;
                    break;
                case 'F':
                    valid.add(direction);
                    break;

            }
        }
        System.out.println(valid.toString());



    }
}
