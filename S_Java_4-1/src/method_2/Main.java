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
		System.out.println("--����--");
	}
	
	static void attack(int point) {
		mana = point - 1;
		System.out.println("--��ȭ ����--");
		System.out.println("���� ���� : " + mana);
	}
	
	
	
	
}
