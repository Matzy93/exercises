public class PangramChecker {

     public boolean isPangram(String input) {
         if(input == null) return false;
			if(input.length()<26) return false;
			String lower_input = input.toLowerCase();
			for(char c = 'a'; c<='z'; c++)
			{
				if(lower_input.indexOf(c) < 0) return false;
			}
			return true;
			
     }

}
