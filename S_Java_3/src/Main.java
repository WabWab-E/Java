
public class Main {

	public static void main(String[] args) {
		
		// [for]
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " x " + i + " = " + String.format("%2d", i * j) + " | ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// [while]
		int while_i = 0;
				
		while (while_i < 10) {
			System.out.print(while_i++);
		}
	}
}
