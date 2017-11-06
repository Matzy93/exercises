public class DifferenceOfSquaresCalculator{

	public DifferenceOfSquaresCalculator(){}

	public int computeSquareOfSumTo(int number){
		int solution = 0;
		for(int i=1; i<=number; i++){
			solution += i;
		}
		return solution * solution;
	}

	public int computeSumOfSquaresTo(int number){
		int solution = 0;
		for(int i=1; i<=number; i++){
			solution += i*i;
		}
		return solution;
	}

	public int computeDifferenceOfSquares(int number){
		int squareOfSum = computeSquareOfSumTo(number);
		int sumOfSqares = computeSumOfSquaresTo(number);
		return squareOfSum - sumOfSqares;
	}
}
