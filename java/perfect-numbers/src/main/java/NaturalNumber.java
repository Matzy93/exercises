class NaturalNumber {

	int number;

	public NaturalNumber(int num) {
		if(num <= 0) {
			throw new IllegalArgumentException("You must supply a natural number (positive integer)");
		}
		this.number = num;
	}

	Classification getClassification(){
		int sum = 0;
		int half_num = number / 2;

		for(int i=1; i<=half_num; i++) {
			if(number % i == 0)	{
				sum += i;
			}
		}

		if(sum==number) return Classification.PERFECT;
		if(sum<number) return Classification.DEFICIENT;
		return Classification.ABUNDANT;
		
	}
}
