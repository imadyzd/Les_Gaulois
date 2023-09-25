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
	
	public String getNom() {
		return nom;
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
		romain.recevoirCoup((force / 3)*effetPotion);
	}

		
	@Override
	public String toString() {

		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois d�cupl�e.");
	}
		
		

	public static void main(String[] args) {
		
		
		
		
	}	
}
