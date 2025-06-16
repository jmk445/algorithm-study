package boj.p1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1406_2 {
    public static void main(String[] args) throws IOException {
        //입력부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int M = Integer.parseInt(br.readLine());
        String[] cmds = new String[M];
        for(int i = 0; i < M; i++) {
            cmds[i] = br.readLine();
        }

        Stack<String> leftSt = new Stack<String>(); //커서의 왼쪽에 있는 문자들
        Stack<String> rightSt = new Stack<String>();//커서의 오른쪽에 있는 문자들
        String[] arr = line.split("");
        for(String s:arr){
            leftSt.push(s);
        }

        for(int i = 0; i < M; i ++) {
            String command = cmds[i];
            char c = command.charAt(0);
            switch(c) {
                case 'L': //왼쪽으로 커서 이동
                    if(!leftSt.isEmpty())
                        rightSt.push(leftSt.pop());
                    break;
                case 'D': //오른쪽으로 커서 이동
                    if(!rightSt.isEmpty()){ //오른쪽에 아무것도 없는, 즉 가장 뒤에 있는 경우가 아니라면
                        leftSt.push(rightSt.pop());
                    }
                    break;
                case 'B': //커서 왼쪽 글자 삭제
                    if(!leftSt.isEmpty())
                        leftSt.pop();
                    break;
                case 'P': //커서 왼쪽에 문자 삽입
                    String element = command.split(" ")[1];

                    leftSt.push(element);
                    break;
                default:
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        String left = "";
        while(!leftSt.isEmpty()){
            sb.append(leftSt.pop());
        }
        sb.reverse();
        left = sb.toString();

        String right = "";
        sb = new StringBuilder();
        while(!rightSt.isEmpty()){
            sb.append(rightSt.pop());
        }
        //잘 생각해보면, stack이기 때문에 오른쪽은 그대로 pop하는대로 추가하면 됨!!
        //sb.reverse();
        right = sb.toString();

        System.out.println(left+right);

    }
}
