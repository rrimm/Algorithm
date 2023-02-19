package sort.selection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraylistExample1 {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		int menu;

		Scanner scan = new Scanner(System.in);

		while (true) {
			print_menu();
			System.out.println("\n메뉴 선택 => ");
			menu = scan.nextInt();
			System.out.println();

			if (menu == 6) {
				System.out.printf("\n프로그램 종료...\n");
				break;
			}

			switch (menu) {
			case 1: // 입력

				System.out.println();
				input_employee(list);
				break;

			case 2: // 출력

				output_employee(list);
				break;

			case 3: // 조회(검색)
				search_employee(list);

				break;

			case 4: // 수정
				update_employee(list);
				break;
			case 5: // 삭제
				delete_employee(list);
				break;
			default:
				System.out.printf("\n메뉴를 다시 입력하세요!!!\n");
				break;

			}

		}

	}

	static void print_menu() {
		System.out.printf("\n*** 사원관리 ***\n");
		System.out.printf("1. 사원정보 입력\n");
		System.out.printf("2. 사원정보 출력\n");
		System.out.printf("3. 사원정보 조회\n");
		System.out.printf("4. 사원정보 수정\n");
		System.out.printf("5. 사원정보 삭제\n");
		System.out.printf("6. 프로그램 종료\n");

	}

	static void input_employee(ArrayList<Employee> list) { // inputData(): 사원정보 저장

		Employee obj = new Employee();
		obj.inputData();
		for (Employee dat : list) {
			if (obj.name.equals(dat.name)) {
				System.out.println("\n사원번호 입력 오류(중복)!!\n");
				return;
			}
		}
		list.add(obj);
		System.out.println("\n사원정보 입력 성공!!\n");

	}

	static void output_employee(ArrayList<Employee> list) {
		if (list.size() == 0) {
			System.out.println("출력할 사원정보가 없습니다!!\n");
			return;
		}

		System.out.printf("\n*** 사원정보 ***\n");
		System.out.println("===============================");
		System.out.println("사원번호\t부서명\t이름\t성별\t이메일");
		System.out.println("===============================");
		for (Employee dat : list) {
			dat.outputData();
		}
		System.out.println("===============================");
		System.out.printf("\t\t 총사원수 : %d\n\n", list.size());
		

		System.out.printf("\n*** 사원정보 ***\n");
		System.out.println("===============================");
		System.out.println("사원번호\t부서명\t이름\t성별\t이메일");
		System.out.println("===============================");
		
		for (Employee dat : list) {
			Collections.sort(list);
			dat.outputData();
		}
			System.out.println("===============================");
			System.out.printf("\t\t 총사원수 : %d\n\n", list.size());
		
	}

	static void search_employee(ArrayList<Employee> list) {
		Scanner scan = new Scanner(System.in);
		System.out.print("조회할 사원번호 입력 => ");
		String empID = scan.next();

		for (Employee dat : list) {
			if (empID.equals(dat.empID)) {
				System.out.println("사원번호\t부서명\t이름\\t성별\\t이메일");
				System.out.println("===============================");
				dat.outputData();
				System.out.println("===============================");
				return;
			}

		}

	}

	public static void update_employee(ArrayList<Employee> list) { // 수정
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 사원번호 입력 => ");
		String empID = scan.next();

		for (Employee dat : list) {
			if (empID.equals(dat.empID)) {

				System.out.print("부서명 입력 => ");
				dat.setDeptname(scan.next());
				System.out.print("이름 입력 => ");
				dat.setName(scan.next());
				System.out.print("성별 입력 => ");
				dat.setGender(scan.next());
				System.out.print("이메일 입력 => ");
				dat.setEmail(scan.next());
				System.out.println("\n사원정보 수정 성공!!\n");
				return;
			}

		}
		System.out.println("\n수정할 사원번호 입력 오류!!\n");
	}

	public static void delete_employee(ArrayList<Employee> list) { // 삭제
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 사원번호 입력 => ");
		String empID = scan.next();

		for (Employee dat : list) {
			if (empID.equals(dat.empID)) {
				list.remove(dat);
				System.out.println("\n사원정보 삭제 성공!!\n");
				return;
			}
		}
		System.out.println("\n삭제할 사원번호 입력 오류!!\n");

	}
}


