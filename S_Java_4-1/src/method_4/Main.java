package method_4;

public class Main {

	public static void main(String[] args) {
	int result = 0;
	
	result = twoNumSum(100,200);
	System.out.println("�޼ҵ� ��� : " + result);
	
	result = twoNumSum(300,400);
	System.out.println("�޼ҵ� ��� : " + result);
	
	result = twoNumSum(500,600);
	System.out.println("�޼ҵ� ��� : " + result);
	}

	private static int twoNumSum(int i, int j) {
		return i + j;
	}
	
}
