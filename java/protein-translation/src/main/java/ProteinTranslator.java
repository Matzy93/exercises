import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

class ProteinTranslator {

	HashMap<String,String> decoder;

	public ProteinTranslator() {
		decoder = new HashMap<>();
		decoder.put("AUG","Methionine");
		decoder.put("UUU","Phenylalanine");
		decoder.put("UUC","Phenylalanine");
		decoder.put("UUG","Leucine");
		decoder.put("UUA","Leucine");
		decoder.put("UCU","Serine");
		decoder.put("UCC","Serine");
		decoder.put("UCA","Serine");
		decoder.put("UCG","Serine");
		decoder.put("UAU","Tyrosine");
		decoder.put("UAC","Tyrosine");
		decoder.put("UGU","Cysteine");
		decoder.put("UGC","Cysteine");
		decoder.put("UGG","Tryptophan");
		decoder.put("UAA","STOP");
		decoder.put("UAG","STOP");
		decoder.put("UGA","STOP");
	}

    List<String> translate(String rnaSequence) {

		List<String> result = new ArrayList<String>();
		//String substring_code = rnaSequence.substring(0,3);
		//String substring = decoder.get(substring_code);
		String substring_code = "";
		String substring = "";

        for(int i=0; i<rnaSequence.length(); i+=3) {

			substring_code = rnaSequence.substring(i,i+3);
			substring = decoder.get(substring_code);

			if(substring.equals("STOP")) {
				i = rnaSequence.length();
			}
			else {
				result.add(substring);
			}

		}

		return result;
    }
}
