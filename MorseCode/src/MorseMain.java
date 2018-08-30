import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MorseMain {
	
	static HashMap<String, String> morseList = new HashMap<String, String>();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create list of all keys for morse code
		createMorseList();
		
		//String of morse code to translate		
		String translate = " /"
				+ ".... . .-.. .-.. --- / "
				+ "-.. .- .. .-.. -.-- / "
				+ ".--. .-. --- --. .-. .- -- -- . .-. / "
				+ "--. --- --- -.. / "
				+ ".-.. ..- -.-. -.- / "
				+ "--- -. / "
				+ "- .... . / "
				+ "-.-. .... .- .-.. .-.. . -. --. . ... / "
				+ "- --- -.. .- -.--";
		
		
		
		ArrayList<String> splitWords = new ArrayList<String>();
		ArrayList<String> splitLetters = new ArrayList<String>();
		
		String wordsList = null;

		//splitWords contain morse for words, splitLetters contain morse for individual letters
		for(String s : translate.trim().split("/")) {
			splitWords.add(s);
			wordsList = wordsList + s + "/";
		}
		
		for(String letters : wordsList.trim().split(" ")) {
			splitLetters.add(letters.trim());
			System.out.println(morseList.get(letters));
		}
	}
	
	public static void createMorseList() {
		morseList.put(".-", "A");
		morseList.put("-...", "B");
		morseList.put("-.-.", "C");
		morseList.put("-..", "D");
		morseList.put(".", "E");
		morseList.put("..-.", "F");
		morseList.put("--.", "G");
		morseList.put("....", "H");
		morseList.put("..", "I");
		morseList.put(".---", "J");
		morseList.put("-.-", "K");
		morseList.put(".-..", "L");
		morseList.put("--", "M");
		morseList.put("-.", "N");
		morseList.put("---", "O");
		morseList.put(".--.", "P");
		morseList.put("--.-", "Q");
		morseList.put(".-.", "R");
		morseList.put("...", "S");
		morseList.put("-", "T");
		morseList.put("..-", "U");
		morseList.put("...-", "V");
		morseList.put(".--", "W");
		morseList.put("-..-", "X");
		morseList.put("-.--", "Y");
		morseList.put("--..", "Z");
		
		morseList.put("-----", "0");
		morseList.put(".----", "1");
		morseList.put("..---", "2");
		morseList.put("...--", "3");
		morseList.put("....-", "4");
		morseList.put(".....", "5");
		morseList.put("-....", "6");
		morseList.put("--...", "7");
		morseList.put("---..", "8");
		morseList.put("----.", "9");
		
		morseList.put("/", " ");
	}

}
