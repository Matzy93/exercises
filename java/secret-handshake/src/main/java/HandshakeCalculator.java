import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {

	int [] ciphers = {8,4,2,1};

   List<Signal> calculateHandshake(int number) {
      boolean should_reverse = checkForReverse(number);
		int signal_number = number % 16;
		List<Signal> signals = new ArrayList<Signal>();

		for(int i=0; i<ciphers.length; ) {
			if(signal_number-ciphers[i] >= 0) {
				signals.add(Signal.values()[ciphers.length-1-i]);
				signal_number-=ciphers[i];
			}
			else {
				i++;
			}							
		}

		if(!should_reverse){
			return signals;		
		}
		else{
			Collections.reverse(signals);
			return signals;
		}
   }

	boolean checkForReverse(int number) {
		int reverse_indicator = number / 16;
		boolean should_reverse = isEven(reverse_indicator);

		return should_reverse;
	}

	boolean isEven(int number){
		if(number % 2 == 0) return true;
		return false;	
	}

}
