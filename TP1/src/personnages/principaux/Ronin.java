package personnages.principaux;
import personnages.Humain;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		this.honneur = 1;
	}
	
	public void donner(int n, Commerçant commercant) {
		if (n > 0 && n <= this.getArgent()) {
			this.perdreArgent(n);
			commercant.gagnerArgent(n);
			this.parler("Je donne " + n + " pièces à " + commercant.getNom() + ".");
		}else {
			this.parler("Je ne peux pas me permettre de donner " + n + "pièces à " + commercant.getNom() + "...");
		}

	}
	
	public void provoquer(Yakuza yakuza) {
		int reputation = yakuza.getReputation();
		if (2 * this.honneur > reputation) {
			//le ronin l'emporte
			this.gagnerArgent(yakuza.perdreDuel());
			this.honneur += 1;
			this.parler("J'ai gagné le duel !");
			
		} else {
			//le yakuza l'emporte
			yakuza.gagnerDuel();
			this.honneur -= 1;
			this.parler("Arrrhhhg ! Je veux ma revanche !");
		}
	}
}
