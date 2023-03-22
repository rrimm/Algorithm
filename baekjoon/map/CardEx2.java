package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
// 백준 10815번
public class CardEx2 {

	 public static void main(String[] args) throws NumberFormatException, IOException {
		 
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        // 상근이가 가진 숫자 카드의 개수
	        int N = Integer.parseInt(br.readLine());
	        // 숫자 카드에 적힌 정수
	        Set<Integer> cardSet = new HashSet<>();
	        
	        StringTokenizer str1 = new StringTokenizer(br.readLine()," ");
	        for(int i = 0 ; i < N ; i++){
	            cardSet.add(Integer.parseInt(str1.nextToken()));
	        }

	        // 주어진 정수의 개수
	        int M = Integer.parseInt(br.readLine());
	        // 주어진 정수
	        int [] numArr = new int[M];
	        
	        StringTokenizer str2 = new StringTokenizer(br.readLine()," ");
	        StringBuilder sb = new StringBuilder();
	        for(int i = 0 ; i < M ; i++){
	            numArr[i] = Integer.parseInt(str2.nextToken());
	        }

	        for(int i = 0 ; i < M ; i++){
	            if(cardSet.contains(numArr[i])){
	            	sb.append("1 ");
				} else {
					sb.append("0 ");
				}
			}
			System.out.println(sb.toString());
	    }

}
//5
//6 3 2 10 -10
//8
//10 9 -5 2 3 4 5 -10