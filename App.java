package week05;

public class App {

public static void main(String[] args) {
	
		String loggedWord = "Hello";
		AsteriskLogger app = new AsteriskLogger();
		SpacedLogger app1 = new SpacedLogger();
				
		app.setLoggedWord(loggedWord);
		//app.getLoggedWord();
		System.out.println();
		app.log(app.getLoggedWord());
		System.out.println();
		app.error(app.getLoggedWord());
		
		app1.setLoggedWord(loggedWord);
		//app1.getLoggedWord();
		System.out.println();
		app1.log(app1.getLoggedWord());
		System.out.println();
		app1.error(app1.getLoggedWord());
	}

}
