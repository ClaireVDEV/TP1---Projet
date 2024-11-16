/*package histoires;

public class MonHistoire {
	public static void main(String[] args) {
		
		Humain José = new Humain("José", 40, "Ricard");
		System.out.println(José.nomméthode());
		
		
		Ronin musaichi = new Samourai("Akimoto", 20, "thé", "Miyamoto");
		
		if (misaichi instanceof Samouraï) {
			Samouraï akimoto = (Samouraï) musaichi;
		}
		akimoto.boire("sake");
	}
}*/
package histoires;
import personnages.Humain;
import personnages.principaux.Commerçant;
import personnages.principaux.Yakuza;
import personnages.principaux.Ronin;

public class MonHistoire{

	public static void main(String [] args) {  
		
		  Humain humain = new Humain("Prof", 10, "Porto");
		  humain.direBonjour();
		  humain.boire();
		  
		  Commerçant commercant = new Commerçant("Marchand", 35);
		  commercant.direBonjour();
		  
		  Yakuza yakuza = new Yakuza("Yaku␣le␣noir", 42, "biere", "WarSong");
		  yakuza.direBonjour();
		  yakuza.extorquer(commercant);
		  
		  Ronin ronin = new Ronin("Roro", 61, "sake");
		  ronin.donner(10, commercant );
		  ronin.provoquer(yakuza);
		  ronin.direBonjour();
		}
}
