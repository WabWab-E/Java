package method_1;

public class Main {
	public static void main(String[] args) {
		
		int usrcmd = 3;
		
		switch (usrcmd) {
		case 1:
			attack();
			break;
			
		case 2:
			guard();
			break;
			
		case 3:
			heal();
			break;
		}
	}
	
	static void attack() {
		System.out.println("--����--");
	}
	
	static void guard() {
		System.out.println("--���--");
	}
	
	static void heal() {
		System.out.println("--ȸ��--");
	}
}