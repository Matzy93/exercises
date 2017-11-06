public class Hamming {

	String left;
	String right;

   Hamming(String leftStrand, String rightStrand) {
		int leftL = leftStrand.length();
		int rightL = rightStrand.length();
		if(leftL != rightL) throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
   	this.left = leftStrand;
		this.right = rightStrand;
			
   }

   int getHammingDistance() {
		int distance = 0;
      int leftL = this.left.length();
		for(int i = 0; i<leftL; i++) {
			if(this.left.charAt(i) != this.right.charAt(i)) distance++;
		}

		return distance;
   }

}
