import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num_1 = scan.nextInt();
		int num_2 = scan.nextInt();
		
		System.out.println("1. [ + ]  2. [ - ]  3. [ * ]  4. [ / ]");
		
		int choice = scan.nextInt();
		
		Calc calc = new Calc();
		
		switch (choice) {
		
		case 1:
			System.out.println(calc.sum(num_1, num_2));
			break;
			
		case 2:
			System.out.println(calc.minus(num_1, num_2));
			break;
			
		case 3:
			System.out.println(calc.multi(num_1, num_2));
			break;
			
		case 4:
			System.out.println(calc.divide(num_1, num_2));
			break;

		default:
			System.out.println(calc.sum(num_1, num_2));
			System.out.println(calc.minus(num_1, num_2));
			System.out.println(calc.multi(num_1, num_2));
			System.out.println(calc.divide(num_1, num_2));
			break;
		}
	}
}
