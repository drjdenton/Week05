package week05;

public class AsteriskLogger implements Logger {
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
		System.out.println("***" + loggedWord + "***");

	}

	
	public void error(String loggedWord) {
		System.out.println("******************"+ "\n***ERROR: " + loggedWord + "***" + "\n******************");
	
	}
	

	public String getLoggedWord() {
		return loggedWord;
	}


	public void setLoggedWord(String loggedWord) {
		this.loggedWord = loggedWord;
	}


}
