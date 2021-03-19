
public class Main {
	// 메인 메소드
	public static void main(String[] args) {
		
		// 출력문
		
		System.out.println(1000 + 1000);
		System.out.println("1000" + 1000);
		System.out.print("1000");
		System.out.println(1000);
		
		// 다음 챕터
		System.out.println("---------------------");
		
		// 변수
		// 'int' - 4 byte 정수형
		// 'double' - 8 byte 실수형
		// 'String' - 문자열
		
		int numI = 123;
		double numD = 1.5;
		String strS = "문자열";
		
		System.out.println(numI);
		System.out.println(numD);
		System.out.println(strS);
		
		// 자동 형변환 [데이터 크기가 큰 쪽으로 따라감]
		System.out.println(numI+numD);
		System.out.println(numD+strS);
	}
}
