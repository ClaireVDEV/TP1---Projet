package personnages;

public class Humain {
	
	//attributs
	private String nom;
	private String boisson;
	private int argent;
	
	//constructeur
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	//methodes
	public void parler(String texte) {
		System.out.println("(< " + this.nom + " >) - " + texte);
	}
	
	public void direBonjour() {
		String texte = "Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boisson + ".";
		parler(texte);
	}
	
	public void boire() {
		String texte = "Mmmm, un bon verre de " + this.boisson + " ! GLOUPS !";
		parler(texte);
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getBoisson() {
		return boisson;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void gagnerArgent(int n) {
		this.argent += n;
	}
	
	public void perdreArgent(int n) {
		if (n>this.argent) {
			this.argent = 0;
		}else {
			this.argent -= n;
		}
	}

}
