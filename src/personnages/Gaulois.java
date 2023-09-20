package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	
	public Gaulois(String nom, int force) {

		this.nom = nom;
		this.force = force;
	}


	public int getForce() {

		return force;
	}


	public void setForce(int force) {

		this.force = force;
	}


	public int getEffetPotion() {
		return effetPotion;
	
	}
	public void parler(String texte) {
		System.out.println(prendreParole() +  " � " + texte + " �");
		
	}
	
	public String prendreParole() {
		return "Le Gaulois " + nom +":";
	
	}
	
	
	public void frapper(Romain romain) {

		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

		
	@Override
	public String toString() {

		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 8);
		System.out.println(asterix);
		asterix.parler("Bonjour");
		Romain rom = new Romain("rom", 8);
		asterix.frapper(rom);
		
		
	}	
}
