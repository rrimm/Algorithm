package lotto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoEx1 {	// arraylist 활용 로또 번호 생성 예제

	public static void main(String[] args) {
		System.out.println("자동으로 로또 번호 6개를 생성하여 출력하는 알고리즘을 구현하시오.");

		List<Integer> list = new ArrayList<Integer>();

		Random ran = new Random();

		for (int i = 0; i < 6; i++) {

			int data = ran.nextInt(45) + 1;

			list.add(data);
			Set<Integer> set = new HashSet<Integer>(list);

			if (set.size() != list.size()) {
				System.out.println("중복!");
				return;
			}

		}
		System.out.println(list);
	}

}

//자동으로 로또 번호 6개를 생성하여 출력하는 알고리즘을 구현하시오.
//<처리조건>
//1. 로또 번호는 Random 클래스를 사용하며 1부터 45까지 생성한다.
//2. 로또 번호 출력시 오름차순으로 출력하며 정렬은 선택정렬을 사용한다.
//3. 로또 번호는 중복을 허용하지 않는다.
//입력
//없음
//출력
//로또 번호 : 1 15 20 30 37 41

 