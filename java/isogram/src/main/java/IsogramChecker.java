import java.util.HashSet;

class IsogramChecker {

	boolean isIsogram(String toCheck) {
		String alphas = toCheck.replaceAll("\\P{L}+","").toLowerCase();
		HashSet<String> letters = new HashSet<>();

		for(int i=0; i<alphas.length(); i++) {
			boolean already = letters.add(String.valueOf(alphas.charAt(i)));
			if(!already) return false;
		}

		return true;
	}
}
