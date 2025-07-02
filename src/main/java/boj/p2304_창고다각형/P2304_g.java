package boj.p2304_창고다각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2304_g {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] heights = new int[1001]; // 위치 범위는 1~1000
        int left = 1000;
        int right = 0;

        int maxH = 0;
        int maxIdx = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int loc = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            heights[loc] = h;
            if (h > maxH) {
                maxH = h;
                maxIdx = loc;
            }
            left = Math.min(left, loc);
            right = Math.max(right, loc);
        }

        int area = 0;
        int currMax = 0;

        // 왼쪽부터 최고점까지
        for (int i = left; i < maxIdx; i++) {
            currMax = Math.max(currMax, heights[i]);
            area += currMax;
        }

        // 오른쪽부터 최고점까지
        currMax = 0;
        for (int i = right; i > maxIdx; i--) {
            currMax = Math.max(currMax, heights[i]);
            area += currMax;
        }

        // 최고 높이 부분은 따로 더함
        area += maxH;

        System.out.println(area);
    }
}

