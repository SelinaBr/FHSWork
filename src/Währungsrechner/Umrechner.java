package Währungsrechner;
import java.util.Scanner;

import Währungsrechner.Currency;

public class Umrechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Currency Euro = new Currency ("Euro", "EUR", 1);
		Currency USDollar = new Currency("US-Dollar", "USD", 1.08);
		Currency BritischePfund = new Currency("Pfund", "GBP", 0.978);
		
		System.out.println("Willkommen bei Currency");
		
		System.out.println("Bitte geben Sie die Währung ein: ");
		Scanner sc = new Scanner(System.in); 
		String inputName = sc.nextLine();
		
		
		System.out.println("Bitte geben Sie den Geldwert ein: ");
		Scanner sc2 = new Scanner(System.in); 
		double inputZahl = sc2.nextDouble();
		
		System.out.println("Ihre eingegebene Währung: "+inputName);
		System.out.println("Ihr eingegebener Geldwert: "+inputZahl);
		
	}

}
