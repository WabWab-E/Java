
public class Car {
// ���� ����
	String carName;

	int fuelBox = 10;
	int speed = 0;
	
	boolean engineState = false;

	void startEngine() {
		if (engineState) {
			if (fuelBox > 0) {
				engineState = true;
				System.out.println("�õ� �ɸ�");
			}
		}
	}
	
	void endEngine() {
		engineState = false;
		System.out.println("�õ� ����");
	}
	
	void speedUp() {
		if (engineState) {
			if (fuelBox > 0) {
				speed += 10;
				--fuelBox;
				System.out.println("���� �ӷ� : " + speed);
			}
		} else {
			endEngine();
		}
	}
	
	void fuelUp(GasStation gasstation) {
		gasstation.getFuel();
	}
}
