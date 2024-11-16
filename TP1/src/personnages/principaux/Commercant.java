package personnages.principaux;
import personnages.Humain;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtorquer() {
		this.perdreArgent(this.getArgent());
		
		return this.getArgent();
	}

	public void recevoir(int n) {
		this.gagnerArgent(n);
	}
}
