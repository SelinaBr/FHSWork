package Währungsrechner;

public class Currency {

	public static double kurs;
	public String Währungsname;
	public String Währungsabkürzung;
	public double Kurs;
	
	
public Currency (String währungsname, String abkürzung, double kurs) {
	this.Währungsname = währungsname;
	this.Währungsabkürzung = abkürzung;
	this.Kurs = kurs;
}


public Currency (String währungsname, double kurs) {
		this.Währungsname = währungsname;
		this.Kurs = kurs;
}
}
