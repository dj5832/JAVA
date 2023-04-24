package e_oop.newGame;

import java.util.Scanner;

public class Game {
		static Scanner sc = new Scanner(System.in);
		static Character c;
	public static void main(String[] args) {

		int input = 0;
		Character c = new Character("DJ");
		
		while(true) {
			System.out.println("1.내정보\t2.게임하기\t3.종료");
			input = Integer.parseInt(sc.nextLine());
			
			switch (input) {
			case 1:
				c.showInfo();
				break;
			case 2:
				play();
				break;
			case 3:
				System.out.println("게임을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("다시 선택해주세요.");
				break;
			}
		}
		
	}	
	private static void play() {
		
		Play p = new Play();
		Play2 p2 = new Play2();
		Play3 p3 = new Play3();
		int input = 0;
		while(true) {
			System.out.println("난이도를 선택해주세요.");
			System.out.println("1.esay\t2.normal\t3.hard\t4.뒤로가기");
			input = Integer.parseInt(sc.nextLine());
			
			switch (input) {
			case 1:
				p.game();
				break;
			case 2:
				p2.game();
				break;
			case 3:
				p3.game();
				break;
			case 4:
				main(null);
				break;
			default:
			System.out.println("다시 입력해주세요.");
				break;
			}
		}		
	}

}
