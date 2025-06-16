//package boj.p1406;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Stack;
//
//public class P1406 {
//    public static void main(String[] args) throws IOException {
//        //입력부
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String line = br.readLine();
//        int N = Integer.parseInt(br.readLine());
//        String[] cmds = new String[N];
//        for(int i = 0; i < N; i++) {
//            cmds[i] = br.readLine();
//        }
//
//        Stack<Character> list = new Stack<Character>();
//
//        for(int i = 0; i < N; i ++) {
//            int curLoc = list.get(line.length()).get('1');
//            switch(cmds[i]) {
//                case "L":
//                    list.get(line.length()).replace('1',curLoc--);
//                    break;
//                case "D":
//                    list.get(line.length()).replace('1',curLoc++);
//                    break;
//                case "B":
//                    //cur-1 을 값을 가지는 키의 값을 -1로 바꾸고
//                    //그 뒤의
//                    break;
//                default:
//                    break;
//            }
//        }
//
//
//
//
//    }
//}
