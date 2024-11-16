package histoires;
import personnages.Humain;
import personnages.principaux.*;
import personnages.secondaires.*;
/*
Commercant -> Colporteur
Ronin -> Samouraï -> Traitre
Yakuza -> Ninja
*/

public class MonHistoire{

	public static void main(String [] args) {
				
		Commercant Mel = new Commercant("Mel", 432);
		Colporteur Hervé = new Colporteur("Hervé", 333);
		
		Ronin Jack = new Ronin("Jack", 44, "Café");
		Ronin Cornas = new Samouraï("Cornas", "Sprite", 763, "Phenor");
		Traitre Lompa = new Traitre("Lompa", 2000,"Scotch" , "Phenor");
		
		Grandmère Louisette = new Grandmère("Louisette");

		Yakuza Hermo = new Yakuza("Hermo", 23, "Thé", "Felgar");
		Ninja Jaja = new Ninja("Jaja",303,"Chocolat", "Pomodel");

		
		Louisette.faireConnaissanceAvec(Mel);
		Lompa.direBonjour();
		Lompa.extorquer(Mel);
		Louisette.faireConnaissanceAvec(Lompa);
		

		}
	
	
}
