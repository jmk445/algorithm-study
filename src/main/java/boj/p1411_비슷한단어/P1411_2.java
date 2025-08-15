package boj.p1411_비슷한단어;
import java.io.*;
import java.util.*;

public class P1411_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (isSimilar(words[i], words[j])) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

    static boolean isSimilar(String a, String b) {
        if (a.length() != b.length()) return false;

        Map<Character, Character> mapAB = new HashMap<>();
        Map<Character, Character> mapBA = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char ca = a.charAt(i);
            char cb = b.charAt(i);

            // a→b 매핑
            if (mapAB.containsKey(ca) && mapAB.get(ca) != cb) return false;
            if (!mapAB.containsKey(ca)) mapAB.put(ca, cb);

            // b→a 매핑 (역방향)
            if (mapBA.containsKey(cb) && mapBA.get(cb) != ca) return false;
            if (!mapBA.containsKey(cb)) mapBA.put(cb, ca);
        }
        return true;
    }
}

