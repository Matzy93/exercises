public class RotationalCipher {

	int rotation;
	
	public RotationalCipher(int num) {
		this.rotation = num % 26;
	}

	String rotate(String toRotate) {
		String result = "";
		for(char c:toRotate.toCharArray()) {
			if(c>='A' && c<='Z') {
				char newChar = (char) (65+((c-65+this.rotation) % 26));
				result+=newChar;	
			}
			else if(c>='a' && c<='z') {
				char newChar = (char) (97+((c-97+this.rotation) % 26));
				result+=newChar;
			}
			else {
				result+=c;
			}	
		}
		return result;
	}
}
