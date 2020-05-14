import java.util.ArrayList;
import java.util.Scanner;

import W�hrungsrechner.Currency;

public class Umrechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Currency Euro = new Currency ("Euro", "EUR", 1);
		Currency USDollar = new Currency("US-Dollar", "USD", 1.08);
		Currency BritischePfund = new Currency("Pfund", "GBP", 0.978);
		
		ArrayList<Currency> currencyListe = new ArrayList<Currency>();
		currencyListe.add(Euro);
		currencyListe.add(USDollar);
		currencyListe.add(BritischePfund);
		
		
		
		
		System.out.println("Willkommen bei Currency");
		
		System.out.println("Bitte geben Sie die W�hrung ein: ");
		Scanner sc = new Scanner(System.in); 
		String inputName = sc.nextLine();
		
		
		System.out.println("Bitte geben Sie den Geldwert ein: ");
		Scanner sc2 = new Scanner(System.in); 
		double inputZahl = sc2.nextDouble();
		
		for (Currency w�hrungsname: currencyListe) {
			if (w�hrungsname.W�hrungsname.equals(inputName)) {
				System.out.println("Ihre eingegebene W�hrung: "+inputName);
			break;
			}
			
		}
		
		
		System.out.println("Ihr eingegebener Geldwert: "+inputZahl);
		
		
	}

}
