package W�hrungsrechner;

public class Currency {

	public static double kurs;
	public String W�hrungsname;
	public String W�hrungsabk�rzung;
	public double Kurs;
	
	
public Currency (String w�hrungsname, String abk�rzung, double kurs) {
	this.W�hrungsname = w�hrungsname;
	this.W�hrungsabk�rzung = abk�rzung;
	this.Kurs = kurs;
}


public Currency (String w�hrungsname, double kurs) {
		this.W�hrungsname = w�hrungsname;
		this.Kurs = kurs;
}
}
