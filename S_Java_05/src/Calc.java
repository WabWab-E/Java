
public class Calc {

	int result = 0;
	int firstNum = 0;
	int secondNum = 0;
	
	
	int sum(int i, int j) {
		firstNum = i;
		secondNum = j;
		
		result = firstNum + secondNum;
		
		return result;
	}
	
	int minus(int i, int j){
		firstNum = i;
		secondNum = j;
		
		result = firstNum - secondNum;
		
		return result;
	}
	
	int multi(int i, int j) {
		firstNum = i;
		secondNum = j;
		
		result = firstNum * secondNum;
		
		return result;
	}
	
	int divide(int i, int j) {
		firstNum = i;
		secondNum = j;
		
		result = firstNum / secondNum;
		
		return result;
	}
	
	
}


