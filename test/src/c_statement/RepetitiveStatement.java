package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		/*
		 * << for문 >> - for(int i = 1; i <= 10; i++) {} - for(1부터 10까지 1씩 증가하면서 반복) {}
		 */

//		for(int i = 1; i<= 10; i++) {
		// for(초기화; 조건식; 증감식) {}
		// 초기화 : 조건식과 증감식에 사용할 변수 초기화
		// 조건식 : 연산결과가 true 이면 블럭 안의 내용을 수행한다.
		// 증감식 : 변수를 증가/감소시켜 반복문을 제어한다.
		// System.out.println(i + "번째 반복"); // 초기화한 변수를 블럭 안에서 사용할 수 있다.
//		}

//		int i; 
//		for(i=0; i < 3; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		System.out.println("===========================");

//		for(int i = 0; i < 100; i++) {
//			System.out.println(i);
//		}

//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//		}

//		for(int i = 0; i < 10; i += 2) {
//			System.out.println(i);
//		}

//		for(int i = 0; ; i++) {
//			System.out.println(i*1000);
//		}

//		for(;;) {
//			System.out.println("무한루프");
//		}

//		for(int i = 0; ; i++) {
//			if(i > 10) {
//				break;
//			}
//			System.out.println(i);
//		}
//		System.out.println("무한루프 탈출!");

//		int sum = 0;
//		for(int i = 0; i <= 100; i += 2) {
//			sum += i;
//			
//		}
//		System.out.println(sum);
//		for(int i = 1; i <= 9; i++) {
//			System.out.println("2 X " + i + " = " + i * 2);
//		}

//		for(int i = 1; i <= 9; i++) {
//		
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i + "X" + j + " = " + i * j);
//			}
//			System.out.println("==========");
//		}

//		for(int i = 1; i <= 5; i++) {
//			for(int j = 5; j > i; j--) {
//				System.out.print(" ");
//			}
//			for(int k = 0; k < i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();

//		for(int i = 0; i <= 5; i++) {
//			for(int j = 5; j > i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for(int k = 5; k > i; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for(int i = 1; i <= 10; i++) {
//			for(int j = 10; j > i; j--) {
//				System.out.print(" ");
//			}
//			for(int k = 0; k < i; k++) {
//				System.out.print("*");
//			}
//			for(int l = 1; l < i; l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 5; j > i; j--) {
//				System.out.print(" ");
//			}
//			for(int k = 0; k < i*2-1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		/*
		 * << while >> - while(조건식) {} - 조건식의 결과가 true인 동안 계속해서 반복 - 반복횟수를 알 수 없을 때
		 * 사용한다.
		 */

//		int a = 0;
//		while(a < 10) {
//			System.out.print(a + " ");
//			a++;
//		}
//		
//		System.out.println();
//		
//		int b = 0;
//		while(true) {
//			if(b > 10) {
//				break;
//			}
//			System.out.print(b + " ");
//			b++;
//		}

		// 사용자가 입력한 단의 구구단을 출력하는 프로그램을 만들어주세요.
		// 특정 값을 입력했을 때 종료가 되게 만들어 주세요.

//		Scanner s = new Scanner(System.in);
//		while (true) {
//			System.out.println("몇단을 출력할까요? (0 : 종료)");
//			int dan = Integer.parseInt(s.nextLine());
//
//			if (dan == 0) {
//				System.out.println("종료되었습니다.");
//				break;
//			}
//			for (int i = 1; i <= 9; i++) {
//				System.out.println(dan + "X" + i + " = " + dan * i);
//			}
//		}

		// while 문과 do-while 문 비교
		int a = 0;
//		while (a < 0) {
//			System.out.print(a + " ");
//			a++;
//		}
//		System.out.println();
//
//		a = 0;
//		do {
//			System.out.print(a + " ");
//			a++;
//		} while (a < 0);
//		System.out.println();

//		a = 0;
//		while(a < 10) {
//			System.out.print(a + " ");
//			a++;
//		}
//		System.out.println();
//		
//		a = 0;
//		do {
//			System.out.print(a + " ");
//			a++;
//		} while(a < 10);
//		System.out.println();
		
//		do {
//			System.out.print(a + " ");
//			++a;
//		} while(a < 10);
		
		// 숫자 맞추기 게임을 만들어 봅시다.
		
//		Scanner s = new Scanner(System.in);
//		int answer =(int)(Math.random() * 100 + 1);
//		int txt;
//		int count;
//		System.out.println(answer);
//		
//		System.out.println("횟수 제한을 입력해주세요");
//		count = Integer.parseInt(s.nextLine());
//		System.out.println("1~100까지의 숫자를 입력해주세요");
//		do {		
//			txt = Integer.parseInt(s.nextLine());
//			count--;
//			if(txt < answer) {
//				System.out.println("up");
//				System.out.println(count + "번 남으셨습니다");
//			} else if(txt > answer) {
//				System.out.println("down");
//				System.out.println(count + "번 남으셨습니다");
//			} if(count == 0) {
//				break;
//			}
//		} while(txt != answer);
//		if(txt == answer) {
//			System.out.println("정답입니다!" + "시도하신 횟수는 " + count + "입니다.");	
//		} else {
//			System.out.println("모든 횟수를 다 사용하셨습니다. 다시 시도하세요");			
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
