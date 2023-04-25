package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ex1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 도감에 수록되어 있는 포켓몬의 개수 N
        int N = Integer.parseInt(st.nextToken());
        // 내가 맞춰야 하는 문제의 개수 M
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String poketmon = br.readLine();
            map.put(poketmon, i);
        }

        StringBuilder sb = new StringBuilder();
        String[] arrayList = new String[M];
        for (int i = 0; i < M; i++) {
            arrayList[i] = br.readLine();
        }

        for (int i = 0; i < M; i++) {
            if (Character.isDigit(arrayList[i].charAt(0))) {
                int index = Integer.parseInt(arrayList[i]);
                sb.append(getKeyByValue(map, index));
            } else {
                sb.append(map.get(arrayList[i]));
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static <K, V> K getKeyByValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (Objects.equals(entry.getValue(), value)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
