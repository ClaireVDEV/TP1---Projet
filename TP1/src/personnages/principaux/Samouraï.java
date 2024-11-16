package personnages.principaux;
import personnages.Humain;
import personnages.principaux.Ronin;

public class Samouraï extends Ronin{
	
	private String seigneur;
	
	public Samouraï(String nom, String boisson, int argent, String seigneur) {
		super(nom, argent, boisson);
		this.seigneur = seigneur;
	}
	
	public void boire(String boisson) {
		this.parler("Je bois un délicieux " + boisson + " !");
	}

}
