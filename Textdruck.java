import java.util.ArrayList;


public class Textdruck implements Drucktyp{

	@Override
	public void drucken(ArrayList <Artikel>artikelListe) {
		// TODO Auto-generated method stub
		for(Artikel a : artikelListe){
			System.out.println(a.getBezeichnung() + ": " + a.getPreis());
		}
	}

	
	
}
