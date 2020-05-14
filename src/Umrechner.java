import java.util.ArrayList;
import java.util.Scanner;

import Währungsrechner.Currency;

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
		
		System.out.println("Bitte geben Sie die Währung ein: ");
		Scanner sc = new Scanner(System.in); 
		String inputName = sc.nextLine();
		
		
		System.out.println("Bitte geben Sie den Geldwert ein: ");
		Scanner sc2 = new Scanner(System.in); 
		double inputZahl = sc2.nextDouble();
		
		for (Currency währungsname: currencyListe) {
			if (währungsname.Währungsname.equals(inputName)) {
				System.out.println("Ihre eingegebene Währung: "+inputName);
			break;
			}
			
		}
		
		
		System.out.println("Ihr eingegebener Geldwert: "+inputZahl);
		
		
	}

}
