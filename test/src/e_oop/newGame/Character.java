package e_oop.newGame;
public class Character {
	String name;
	
	Character(String name){
		
		this.name = name;
		
	}
	
	void showInfo() {
		
		System.out.println("============================================");
		System.out.println("==================상태=======================");
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + (Play.sum + Play2.sum + Play3.sum));
		System.out.println("perfect : " + (Play.perfect + Play2.perfect + Play3.perfect));
		System.out.println("miss : " + (Play.miss + Play2.miss + Play3.miss));		
		System.out.println("============================================");
		System.out.println("============================================");
	}
}
