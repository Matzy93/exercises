class LuhnValidator {

    boolean isValid(String candidate) {
		
		candidate = candidate.replaceAll("\\s+","");
		if(!candidate.matches("^[0-9]+$")) return false;
		int length = candidate.length();
        if(length<=1) return false;
		
		char[] string_chars = candidate.toCharArray();
		int sum = 0;
		for(int i=0; i<length; i++) {
            int x = Character.getNumericValue(string_chars[i]);
			if(i%2 == length%2) {
				if(x>4) {
					x = x*2-9;
				}
				else {
					x = x*2;
				}
				sum += x;
			}
			else {
				sum += x;
			}
		}

		if(sum%10 == 0) return true;
		return false;

    }

}
