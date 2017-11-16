import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

class DiamondPrinter {

	List<String> printToList(char letter) {
		
		int number = letter - 'A';
		String[] printed = new String[2*number+1];

		char[] a_string = new char[2*number+1];
		for(int i=0; i<2*number+1; i++)	{
			if(i==number) {
				a_string[i] = 'A';
			}
			else {
				a_string[i] = ' ';
			}
		}

		String a_s = new String(a_string);
		if(number == 0) {
			printed[0] = a_s;
		}
		else {
			printed[0] = a_s;
			printed[number*2] = a_s;
		}

		for(int i=1; i<number+1; i++) {
			char[] current = new char[2*number+1];
			for(int j=0; j<2*number+1; j++) {
				if(j==number-i | j==number+i) {
					current[j] = (char) (65+i);
				}
				else {
					current[j] = ' ';
				}	
			}
			String current_s = new String(current);
			if(i==number) {
				printed[i] = current_s;
			}
			else {
				printed[i] = current_s;
				printed[number*2-i] = current_s;
				
			}
		}
		return asList(printed);	
	}


}
