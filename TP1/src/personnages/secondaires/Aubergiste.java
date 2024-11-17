package personnages.secondaires;
import Newname.Auberge;
import personnages.principaux.Commercant;
import personnages.Humain;

public class Aubergiste extends Commercant{

	private String NomAuberge;
	private String boisson;
	
	public Aubergiste(String nom, int argent, String boisson, String NomAuberge) {
		super(nom, argent);
		this.boisson = boisson;
		this.NomAuberge = NomAuberge;
	}
	
	
	@Override
	public void direBonjour(Auberge auberge) {
		this.parler("Bienvenue dans l'auberge" + auberge.getNomAuberge() + " !");
		this.parler("Mon nom est " + this.nom + ". Souhaitez vous boire quelque chose ?");
	}
	
}
