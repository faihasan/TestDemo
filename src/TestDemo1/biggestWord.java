package TestDemo1;

public class biggestWord {
	
	public String[] bWord(String sentence){ //bWord object with String Parameter and return type Array
		String bigW = null;
		int wordCount = 0;
		int big = 0;
		String[] result = new String[2];
		
		String[] bigWord = sentence.split(" "); //Breaking the words with "space"
		wordCount = bigWord.length;
		
		for(int i=0; i<wordCount; i++){ //searching for the biggest word
			if(big < bigWord[i].length()){
				bigW = bigWord[i];
				big = bigWord[i].length(); 
			}			
			
			
		}
		
		result[0] = bigW;
		result[1] = Integer.toString(big);
		
		return result; //returned array
		
		
	}

}
