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
		
		do {
			System.out.println("Bitte geben Sie die Währung ein: ");
			Scanner sc = new Scanner(System.in); 
			String inputName = sc.nextLine();
		
		
		 
		
		
			for (Currency währungsname: currencyListe) {
				if (währungsname.Währungsname.equals(inputName)) {
					System.out.println("Ihre eingegebene Währung: "+inputName);
					break;
				}
			}
			
			System.out.println("Bitte geben Sie den Geldwert ein: ");
			Scanner sc2 = new Scanner(System.in); 
			double inputZahl = sc2.nextDouble();
			System.out.println("Ihr eingegebener Geldwert: "+inputZahl);
			
			
		
			System.out.println("Möchten Sie das Programm fortsetzen? Bitte geben sie 'j' für ja oder 'n' für nein ein: ");
			Scanner sc3 = new Scanner(System.in);
			String inputChar = sc3.nextLine();
		
		
			
			if(inputChar == "j")	{
				continue;
			}
			
			else if (inputChar.contentEquals("n"))  {
					break;
				}
			else {
				System.out.println("Diese Eingabe ist nicht zulässig!");
			}
		
			
		
		
		} while (true);
	}

}
