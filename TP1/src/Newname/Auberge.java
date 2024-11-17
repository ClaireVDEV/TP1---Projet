package Newname;
import personnages.principaux.*;
import personnages.secondaires.*;
import personnages.Humain;

public class Auberge {
	
	private String nom;
	private int capacite;
	private Humain [] occupants = new Humain [capacite];
	java.util.Random r = new java.util.Random();
	
	public Auberge(String nom, int capacite) {
		this.nom = nom;
		this.capacite = capacite;
	}
	
	public void Saluer() {
		for (int i = 0; i < this.capacite ; i++) {
			this.occupants[i].direBonjour();
		}
	}
	
	public int PrendrePlace(Humain humain, Aubergiste aubergiste) {
		int NumPlace = -1;
		for (int i = 0 ; i < this.capacite ; i++) {
			if (this.occupants[i] == null) {
				this.occupants[i] = humain;
				humain.direBonjour();
				this.Saluer();
				NumPlace = i;
				break;
			}else {
				aubergiste.parler("Je suis désolé mais l'auberge est complète.");
				break;
			}
		}
		return NumPlace;
	}
	
	public void LiberePlace(Humain humain) {
		this.occupants[NumPlace]
	}
	
	public void payerLaTournee(Humain humain) {
		if (fight() == 1) {
			humain.parler("Et pour fêter ça, trinquons!");
			for (int i = 0 ; i < this.capacite ; i++){
				this.occupants[i].boire();
			}
		}
	}
	

	
	public int fight() {
		if 
		return 0;
		else
		return 1;
		
		
	}
	
	public String getNomAuberge() {
		return this.nom;
	}
}
