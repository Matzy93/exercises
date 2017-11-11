public class CollatzCalculator {

	int computeStepCount(int number) {
		if(number<1) throw new IllegalArgumentException("Only natural numbers are allowed");
		int count = 0;
		while(number!=1) {
			if(number%2==0) {
				number=number/2;
			}
			else {
				number=number*3+1;
			}
			count++;
		}
		return count;
	}
}
