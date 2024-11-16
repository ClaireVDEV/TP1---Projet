package personnages.principaux;
import personnages.Humain;

public class Commerçant extends Humain {
	
	public Commerçant(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtorquer() {
		int argent = this.getArgent();
		this.perdreArgent(argent);
		return argent;
	}

	public void recevoir(int n) {
		this.gagnerArgent(n);
	}
}
