package personnages.secondaires;
import personnages.principaux.Commerçant;

public class Colporteur extends Commerçant{
	
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
