package boj.p1965_상자넣기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1965_nlogn {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] sizes = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            sizes[i] = Integer.parseInt(st.nextToken());
        }

        // LIS 배열: 현재까지의 증가 수열을 유지하는 배열
        List<Integer> lis = new ArrayList<>();

        for (int size : sizes) {
            if (lis.isEmpty() || lis.get(lis.size() - 1) < size) {
                // 현재 상자가 마지막 상자보다 크면 그대로 추가 (수열을 연장)
                lis.add(size);
            } else {
                // 현재 상자를 넣을 수 있는 위치를 이진 탐색으로 찾음
                int idx = lowerBound(lis, size);
                // 더 작은 값으로 교체하여 이후 더 긴 수열을 만들 수 있도록 함
                lis.set(idx, size);
            }
        }

        // lis 리스트의 길이가 최장 증가 수열 = 상자를 넣을 수 있는 최대 개수
        System.out.println(lis.size());
    }

    // 이진 탐색: 현재 수보다 같거나 큰 값이 처음 나타나는 위치를 찾음
    private static int lowerBound(List<Integer> list, int key) {
        int left = 0;
        int right = list.size();

        while (left < right) {
            int mid = (left + right) / 2;

            if (list.get(mid) < key) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
