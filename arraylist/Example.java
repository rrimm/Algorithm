package arraylist;

import java.util.Scanner;

public class Example {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		Grade data;
		int menu;

		do {
			print_menu();
			System.out.println("\n메뉴 선택 => ");
			menu = in.nextInt();

			if (menu == 5) {
				System.out.printf("\n프로그램 종료...\n");
				break;
			}

			switch (menu) {
			case 1:
				System.out.println();
				
				data = new Grade();
				
				System.out.print("번호 입력 => ");
				data.setID(in.nextInt());
				System.out.print("이름 입력 => ");
				data.setName(in.next());
				System.out.print("점수 입력 => ");
				data.setScore(in.nextInt());
			    
				arr.insertLastNode(data);
				
				break;
				
			case 2:
				arr.printList();
				break;
				
			case 3:
				System.out.println();
				data = new Grade();
				System.out.print("검색할 번호 입력 => ");
				data.setID(in.nextInt());
				arr.searchNode(data);
				break;
				
			case 4:
				System.out.println();
				data = new Grade();
				System.out.print("삭제할 번호 입력 => ");
				data.setID(in.nextInt());
				arr.deleteNode(data);
				break;
				
			default:
				System.out.printf("\n메뉴를 다시 입력하세요!!!\n");
				break;

			}
			
		}while(true);

	}
	
	static void print_menu() {
		System.out.printf("\n*** 메뉴 ***\n");
		System.out.printf("1. 데이터 입력\n");
		System.out.printf("2. 데이터 출력\n");
		System.out.printf("3. 데이터 검색\n");
		System.out.printf("4. 데이터 삭제\n");
		System.out.printf("5. 프로그램 종료\n");
		
	}
	

}




