package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ex1620_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 도감에 수록되어 있는 포켓몬의 개수 N
        int N = Integer.parseInt(st.nextToken());
        // 내가 맞춰야 하는 문제의 개수 M
        int M = Integer.parseInt(st.nextToken());

        String[] poketmons = new String[N + 1];
        for (int i = 1; i <= N; i++) {
            poketmons[i] = br.readLine();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (Character.isDigit(input.charAt(0))) {
                int index = Integer.parseInt(input);
                sb.append(poketmons[index]);
            } else {
                for (int j = 1; j <= N; j++) {
                    if (poketmons[j].equals(input)) {
                        sb.append(j);
                        break;
                    }
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
