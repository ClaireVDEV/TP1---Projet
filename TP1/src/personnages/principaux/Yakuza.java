package personnages.principaux;
import personnages.Humain;
import personnages.secondaires.Colporteur;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
	}
	
	public String getClan() {
		return clan;
	}
	
	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commerçant commercant) {
		this.reputation += 1;
		this.parler("J'ai extorqué " + commercant.getNom() + " !");
		
		if (commercant instanceof Colporteur) {
			int thunes = commercant.seFaireExtorquer();
			commercant.perdreArgent(thunes);
			this.gagnerArgent(thunes);
		}else {
			commercant.perdreArgent(commercant.getArgent());
			this.gagnerArgent(commercant.getArgent());
		}
	}
	
	public void gagnerDuel() {
		this.reputation += 1;
		this.parler("J'ai gagné le duel !");
	}
	
	public int perdreDuel() {
		this.perdreArgent(this.getArgent());
		this.reputation -= 1;
		this.parler("J'ai perdu le duel.");
		return this.getArgent();
	}
	
	//redef du bonjour d'humain
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je fais partie du clan " + this.clan + " !");
	}
	
}
