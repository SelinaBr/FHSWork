package W�hrungsrechner;

public class Calculation extends Currency{

	
	public static String ergebnis;
	public double Betrag;
	
	public Calculation(String w�hrungsname, double kurs, double betrag) {
		super(w�hrungsname, kurs);
		this.Betrag = betrag;
		
	}

public static double calculation(double kurs,double betrag) {
		double ergebnis = kurs*betrag;
		return ergebnis;
}
}

	
