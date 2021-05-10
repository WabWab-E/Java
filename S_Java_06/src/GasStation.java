
public class GasStation {
	int fuelBox = 100;
	
	public int getFuel() {
		if (fuelBox > 0) {
			fuelBox -= 10;
			return 10;
		} else {
			return 0;
		}
	}
}
