class LargestSeriesProductCalculator {

	String number;

    LargestSeriesProductCalculator(String inputNumber) {
		if(inputNumber == null) {
			throw new IllegalArgumentException("String to search must be non-null.");
		}
		if(!inputNumber.matches("^[0-9]+$") && inputNumber.length() != 0) {
			throw new IllegalArgumentException("String to search may only contain digits.");
		}        
		this.number = inputNumber;
    }

	// I have three for loops and one while loop, highly likely can be solved with less, but not enjoying the exercise :D
	// might come back later to improve it
    long calculateLargestProductForSeriesLength(int numberOfDigits) {

		if(numberOfDigits<0) {
			throw new IllegalArgumentException("Series length must be non-negative.");
		}
		if(numberOfDigits>number.length()) {
			throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
		}

        char [] char_numbers = this.number.toCharArray();
		int[] digits = new int[char_numbers.length];

		for(int i=0; i<digits.length; i++) {
			char c = char_numbers[i];
			int digit = Character.getNumericValue(c);
			digits[i] = digit;
		}

		int firstb_index = 0; //the starting index of the largest series
		int lastb_index = numberOfDigits-1; //the ending index of the largest series
		long best_product = 1;

		for(int i=0; i<numberOfDigits; i++) {
			best_product *= digits[i];	
		}

		int firstc_index = 1; //the starting index of the current series
		int lastc_index = numberOfDigits; //the ending index of the largest series
		long current_product = best_product;

		while(lastc_index<digits.length){
			// cannot divide by zero, this is a way around...
			if(current_product == 0) {
				current_product = product(firstc_index,lastc_index,digits);
			}
			else {
				current_product = current_product/digits[firstc_index-1]*digits[lastc_index];
			}

			if(current_product>best_product) {
				firstb_index = firstc_index;
				lastb_index = lastc_index;
				best_product = current_product;
			}
			firstc_index++;
			lastc_index++;
	
		}

		best_product = 1;

		for(int i=firstb_index; i<=lastb_index; i++) {
			best_product *= digits[i];	
		}

		return best_product;
    }

	long product(int from, int to, int[] digits) {
		long product = 1;

		for(int i=from; i<=to; i++) {
			product *= digits[i];	
		}
		return product;
	}
}
