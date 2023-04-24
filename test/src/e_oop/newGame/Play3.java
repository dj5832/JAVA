package e_oop.newGame;

import java.util.Random;
import java.util.Scanner;

public class Play3 {
	
	Scanner sc = new Scanner(System.in);
	String[] st = {"봛묽", "긿곫", "빯릵", "웗읆", "옓뮭", "맭풹", "홣휋", "맗공", "닩춫", "붼쥚"}; 
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
		sum = perfect * 100;
		s = p * 100;
		System.out.println("점수 : " + s);
		System.out.println("perfect : " + p);
		System.out.println("miss : " + m);
		
	}
}
