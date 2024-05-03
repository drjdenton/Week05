package week05;

public class SpacedLogger implements Logger {

	private String loggedWord;
	
	@Override
	public void log() {
		// TODO Auto-generated method stub

	}

	@Override
	public void error() {
		// TODO Auto-generated method stub

	}

	public void log(String loggedWord) {
		char[] spacedWord = loggedWord.toCharArray();
		System.out.print("***");
		for(char letter : spacedWord) {
			System.out.print(letter + " ");
		}
		System.out.println("***");
	}
	
	public void error(String loggedWord) {
		char[] spacedWord  = loggedWord.toCharArray();
		System.out.println("\n***********************");
		System.out.print("***ERROR: ");
		for(char letter : spacedWord) {
			System.out.print(letter + " ");
		}
		System.out.print("***");
		System.out.print("\n***********************");
	}	

	public String getLoggedWord() {
		return loggedWord;
	}

	public void setLoggedWord(String loggedWord) {
		this.loggedWord = loggedWord;
	}

}
