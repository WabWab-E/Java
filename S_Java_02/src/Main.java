
public class Main {

	public static void main(String[] args) {

		// [if]
		int a = 9;
		
		if (a < 10) {
			System.out.println("10은 9보다 크다");
		}
		
		
		// [switch]
		
		int b = 80;
		
		switch (b) {
		case 100:
			System.out.println("A");
			break;

		case 90:
			System.out.println("B");
			break;
			
		case 80:
			System.out.println("C");
			break;
			
		case 70:
			System.out.println("D");
			break;
		default: 
			System.out.println("E");
			break;
		}
		
//------------------------------------------------------
		
		int num = 7;
		
		switch (num) {
		case 1:
		case 7:
			System.out.println("SK");
			break;
			
		case 6:
		case 8:
			System.out.println("KTF");
			break;
			
		case 9:
			System.out.println("LG");
			break;
			
		default:
			System.out.println("UNKNOWN");
			break;
		}
		
//------------------------------------------------------	
		
		int month = 2;
		
		switch (month) {
		case 1: case 3: case 5: case 7:
		case 8: case 10: case 12:
			System.out.println(month + "월은 31일까지 있습니다.");
			break;

		case 4: case 6: 
		case 9: case 11:
			System.out.println(month + "월은 30일까지 있습니다.");
			
		default:
			System.out.println(month + "월은 28일까지 있습니다");
			break;
		}
	}
}
