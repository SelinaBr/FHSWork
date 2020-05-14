package Währungsrechner;

public class Calculation extends Currency{

	
	public static String ergebnis;
	public double Betrag;
	
	public Calculation(String währungsname, double kurs, double betrag) {
		super(währungsname, kurs);
		this.Betrag = betrag;
		
	}

public static double calculation(double kurs,double betrag) {
		double ergebnis = kurs*betrag;
		return ergebnis;
}
}

	
