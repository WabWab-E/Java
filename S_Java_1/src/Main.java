
public class Main {
	// ���� �޼ҵ�
	public static void main(String[] args) {
		
		// ��¹�
		
		System.out.println(1000 + 1000);
		System.out.println("1000" + 1000);
		System.out.print("1000");
		System.out.println(1000);
		
		// ���� é��
		System.out.println("---------------------");
		
		// ����
		// 'int' - 4 byte ������
		// 'double' - 8 byte �Ǽ���
		// 'String' - ���ڿ�
		
		int numI = 123;
		double numD = 1.5;
		String strS = "���ڿ�";
		
		System.out.println(numI);
		System.out.println(numD);
		System.out.println(strS);
		
		// �ڵ� ����ȯ [������ ũ�Ⱑ ū ������ ����]
		System.out.println(numI+numD);
		System.out.println(numD+strS);
	}
}
