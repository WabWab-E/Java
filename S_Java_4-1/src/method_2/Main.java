package method_2;

public class Main {

	static int mana = 3;

	public static void main(String[] args) {
		
		int usrcmd = 1;
		
		if (mana > 1) {
			attack(mana);
		} else {
			attack();
		}
		
	}
	
	static void attack() {
		System.out.println("--공격--");
	}
	
	static void attack(int point) {
		mana = point - 1;
		System.out.println("--강화 공격--");
		System.out.println("남은 마나 : " + mana);
	}
	
	
	
	
}
