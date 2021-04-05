
public class Car {
// 전역 변수
	String carName;

	int fuelBox = 10;
	int speed = 0;
	
	boolean engineState = false;

	void startEngine() {
		if (engineState) {
			if (fuelBox > 0) {
				engineState = true;
				System.out.println("시동 걸림");
			}
		}
	}
	
	void endEngine() {
		engineState = false;
		System.out.println("시동 꺼짐");
	}
	
	void speedUp() {
		if (engineState) {
			if (fuelBox > 0) {
				speed += 10;
				--fuelBox;
				System.out.println("현재 속력 : " + speed);
			}
		} else {
			endEngine();
		}
	}
	
	void fuelUp(GasStation gasstation) {
		gasstation.getFuel();
	}
}
