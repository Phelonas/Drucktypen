
public class maindruck {

	
	public static void main(String[] args) {
		
		Rechnung rechnung = new Rechnung();
		rechnung.add(new Artikel("schnaps", 3.55));
		rechnung.add(new Artikel("buttermilch", 50.00));
		rechnung.drucken(new Textdruck());
		
	}
}
