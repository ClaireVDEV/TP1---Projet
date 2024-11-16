package personnages.secondaires;
import personnages.Humain;

public class Grandmère extends Humain{
	
	java.util.Random r = new java.util.Random();
	private int nbConnaissances = 0;
	
	private Humain [] memoire = new Humain [30];
	
	public Grandmère(String nom) {
		super(nom, 0, "tisane");
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		this.direBonjour();
		humain.direBonjour();
		this.parler("..." + humain.getNom() + ".. Quel joli nom !");
		this.parler("Ravie de faire votre connaissance!");
		
		//update de la mémoire
		if (nbConnaissances < 31) {
			this.memoire[this.nbConnaissances] = humain;
			this.nbConnaissances+=1;
		}else {
			for (int i=0 ; i<30 ; i++) {
				this.memoire[i+1] = this.memoire[i];
			}
			this.memoire[0] = humain;
		}

	}
	
	public void ragoter() {
		Humain untel = this.memoire[r.nextInt(1,31)];
			if (untel instanceof Traitre) {
				this.parler("Je sais que " + untel.getNom() + " est un traitre!");
			}else {
				this.parler("Je crois que " + untel.getNom() + " est un " + this.humainHasard() + ".");
			}
	}
	
	private String humainHasard() {
		return switch(r.nextInt(1,7)) {
			case 1 -> "Yakuza";
			case 2 -> "Commerçant";
			case 3 -> "Samouraï";
			case 4 -> "Ronin";
			case 5 -> "Ninja";
			case 6 -> "Colporteur";
			default -> "Aucune classe";
		};
	}

}
