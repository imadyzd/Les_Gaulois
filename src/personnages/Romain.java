package personnages;

public class Romain {

	
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert this.force > 0 :"La force doit étre positive";
	}
	
	
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		int forceRom = force; 
		assert forceRom > 0 : "La force d'un romain est toujours positive";
		
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} 
		else {
			parler("J'abandonne...");
		}
		assert forceRom > force : "La force a diminué";
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("minus", 6);
		
		minus.parler("Bonjour");
		minus.recevoirCoup(8);
		System.out.println(Equipement.CASQUE);
	}

}

