import java.util.HashMap;

class TwelveDays {

	String [] song = {"On the "," day of Christmas my true love gave to me, ","twelve Drummers Drumming, ","eleven Pipers Piping, ","ten Lords-a-Leaping, ","nine Ladies Dancing, ","eight Maids-a-Milking, ","seven Swans-a-Swimming, ","six Geese-a-Laying, ","five Gold Rings, ","four Calling Birds, ","three French Hens, ","two Turtle Doves, ","a Partridge in a Pear Tree."};

	HashMap<Integer,String> days;
	public TwelveDays() {
		this.days = new HashMap<Integer,String>();
		this.days.put(1,"first");
		this.days.put(2,"second");
		this.days.put(3,"third");
		this.days.put(4,"fourth");
		this.days.put(5,"fifth");
		this.days.put(6,"sixth");
		this.days.put(7,"seventh");
		this.days.put(8,"eighth");
		this.days.put(9,"ninth");
		this.days.put(10,"tenth");
		this.days.put(11,"eleventh");
		this.days.put(12,"twelfth");

	}

    String verse(int verseNumber) {
		String verse = song[0]+this.days.get(verseNumber)+song[1];
		for(int i=12-verseNumber; i<12; i++) {
			if(verseNumber>1 && i==11) {
				verse+="and "+song[2+i];
			}
			else {
				verse+=song[2+i];
			}	
		}
        return verse+"\n";
    }

    String verses(int startVerse, int endVerse) {
        String verses = "";
		for(int i = startVerse; i<endVerse; i++) {
			verses+=verse(i)+"\n";		
		}

		verses+=verse(endVerse);

		return verses;
    }
    
    String sing() {
        return verses(1,12);
    }
}
