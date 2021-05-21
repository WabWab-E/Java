import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();

		switch (input) 
		{
			case 1: {new FlowLayout_Swing();
				break;}
			case 2: {new BorderLayout_Swing();
				break;}
			case 3: {new GridLayout_Swing();
			break;}
			case 4: {new CardLayout_Swing().rotate();
			break;}
		}

	}
}
