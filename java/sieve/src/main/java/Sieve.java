import java.util.List;
import java.util.ArrayList;

class Sieve {

	int max;

    Sieve(int maxPrime) {
        if(maxPrime<2) throw new IllegalArgumentException("Number must be larger than 2");
		this.max = maxPrime;
    }

    List<Integer> getPrimes() {
		boolean[] candidates = new boolean[this.max-1];
        List<Integer> primes = new ArrayList<Integer>();
		for(int i=0; i<candidates.length; i++) {
			if(!candidates[i]) {
				primes.add(i+2);	
			}
			for(int j=i; j<candidates.length; j+=(i+2)) {
				candidates[j]=true;	
			}
		}
		return primes;
    }
}
