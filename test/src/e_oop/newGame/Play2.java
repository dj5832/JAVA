package e_oop.newGame;

import java.util.Random;
import java.util.Scanner;


public class Play2 {
	Scanner sc = new Scanner(System.in);
	String[] st = {"계단", "화분", "꿀벌", "얼음", "예보", "매체", "화해", "망고", "단추", "반지"}; 
	String[] sta = new String[st.length];
	Random r=new Random();
	static int perfect;
	static int miss;
	static int sum;
	int p;
	int m;
	int s;
	
	public void game() {
		
		System.out.println("게임을 시작합니다 ");
		int count = 0;
		while(count < 10) {
			int x = r.nextInt(sta.length);
			sta[x] = st[x];
			System.out.println(sta[x]);
			String input = sc.nextLine();
			if(input.equals(sta[x])) {
				perfect++;
				p++;
			}else if(!input.equals(sta[x])){
				miss++;
				m++;
			}
			count++;
		}
		sum = perfect * 20;
		s = p * 20;
		System.out.println("점수 : " + s);
		System.out.println("perfect : " + p);
		System.out.println("miss : " + m);
		
	}
	
}
