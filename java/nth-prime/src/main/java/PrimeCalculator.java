public class PrimeCalculator {
	
	int nth(int num) {
		if(num<1) throw new IllegalArgumentException("Only positive integers");
		int candidate = 1;

		for(int count=0; count<=num; candidate++) {
			if(isPrime(candidate)) {
				count++;
			}
		}
		return candidate-1;
	}

	boolean isPrime(int number) {
		for(int i=2; i<=Math.sqrt(number); i++) {
			if(number%i == 0) return false;
		}
		return true;
	}

}
