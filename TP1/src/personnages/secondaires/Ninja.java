package personnages.secondaires;
import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Yakuza;

public class Ninja extends Yakuza{
	
	java.util.Random r = new java.util.Random();
	
	private String clanSecret;
	private static final String[] clansNinja = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	
	public Ninja(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson, clan);
	}

	@Override
	public void direBonjour() {
		super.direBonjour();		
		//déterminer le clan secret
		this.clanSecret = switch (r.nextInt(1,6)) {
			case 1 -> clansNinja[1];
			case 2 -> clansNinja[2];
			case 3 -> clansNinja[3];
			case 4 -> clansNinja[4];
			case 5 -> clansNinja[5];
			default -> "";
		};	
		this.parler("Ne le dites à personne mais mon clan secret est " + this.getClan() + " " + this.clanSecret + ".");
	}
	
	//surcharge Yakuza
	@Override
	public void extorquer(Commercant commercant) {
		
		//vérifie combien a rapporté l'extorction
		if (commercant.getArgent() > 0) {
			
			int ArgentT1 = this.getArgent();
			super.extorquer(commercant);
			int ArgentT2 = this.getArgent();
			int ArgentVole = ArgentT2 - ArgentT1;
			
			if (ArgentVole < 50) {
				while (commercant.getArgent() >=0 ){
					super.extorquer(commercant);
				}
			}
		}
	commercant.parler("Je n'ai plus rien ! Laissez moi !");	
	}
	
}

