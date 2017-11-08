import java.util.HashSet;

class SumOfMultiples {

	int number;
	int[] set;

    SumOfMultiples(int number, int[] set) {
        this.number = number;
		this.set = set;
    }

    int getSum() {
        HashSet<Integer> multiples = new HashSet<Integer>();
		int sum = 0;

		for(int i=1; i<this.number; i++) {
			for(int j=0; j<set.length; j++) {
				if(i % set[j] == 0) {
					multiples.add(i);
					j = set.length;
				}
			}
		}

		for(Integer i : multiples) {
			sum += i;	
		}
		return sum;
    }

}
