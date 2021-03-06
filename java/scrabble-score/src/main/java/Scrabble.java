import java.util.HashMap;

class Scrabble {

	String word;
	HashMap<String,Integer> scores = new HashMap<String,Integer>();
	String [] one = {"A", "E", "I", "O", "U", "L", "N", "R", "S", "T"};
	String [] two = {"D", "G"};
	String [] three = {"B", "C", "M", "P"};
	String [] four = {"F", "H", "V", "W", "Y"};
	String [] five = {"K"};
	String [] eight = {"J", "X"};
	String [] ten = {"Q", "Z"};
	String [][] all_scores = {this.one, this.two,this.three,this.four,this.five,this.eight,this.ten};

   Scrabble(String word) {
		if(word == null) throw new IllegalArgumentException("no empty words");
      this.word = word.toUpperCase();
		for(int i = 0; i<7;i++)
		{
			int score = 0;
			if(i==6) score = 10;
			else if(i==5) score = 8;
			else score = i+1;
			for(String c : all_scores[i])	scores.put(c,new Integer(score));
		}
		
   }

   int getScore() {
		int total = 0;
      for(char c:this.word.toCharArray()) total+=scores.get(Character.toString(c));
		return total;
   }

}
