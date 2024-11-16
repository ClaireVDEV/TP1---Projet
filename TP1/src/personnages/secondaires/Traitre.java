package personnages.secondaires;
import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Samouraï;

public class Traitre extends Samouraï{
	
	private int traitrise = 0;
	
	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, boisson, argent, seigneur);
	}

	public void extorquer(Commercant commercant) {
		if (this.traitrise < 3) {
			this.gagnerArgent(commercant.getArgent());
			commercant.perdreArgent(commercant.getArgent());
			this.parler("J'ai extorqué " + commercant.getNom() + " !");
			this.traitrise += 1;
		} else {
			this.parler("Mon niveau de traitrise est trop élevé pour que je puisse extorquer ce commercant...");
		}

	}
	
	@Override
	public void direBonjour() {
		this.direBonjour();
		this.parler("Mon niveau de traitrise est de " + this.traitrise + " .");
	}
	
	public void faireLeGentil(Humain humain, int argent) {
		if (humain instanceof Commercant) {
			Commercant commercant = (Commercant) humain;
			this.donner(argent, commercant);
		}else {
			this.perdreArgent(argent);
			humain.gagnerArgent(argent);
		}
		this.parler("Voila pour vous..");
		this.parler("Faisons ami-ami!");
		if (this.traitrise > 0) {
			this.traitrise = this.traitrise * (9/10);
		} else {
			this.traitrise = 0;
		}
		
	}
}
