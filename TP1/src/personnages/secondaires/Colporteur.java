package personnages.secondaires;
import personnages.principaux.Commercant;

public class Colporteur extends Commercant{
	
	public Colporteur(String nom, int argent) {
		super(nom, argent);
	}
	
	@Override
	public int seFaireExtorquer() {
		int thunesRestantes = (this.getArgent())/2;
		this.parler("ah ah ah.. s'il savait!");
		return thunesRestantes;
	}

}
