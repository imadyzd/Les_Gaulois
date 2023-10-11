package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois ++;
		
		
	}
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}
	
	
	public void afficherVillageois() {
		System.out.println("Dans "+nom+" du chef "+ chef.getNom()+" vivent les legendaires gaulois : \n");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- "+villageois[i].getNom());
			
		}
		
	}
	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles", 30);
		/*Gaulois gaulois = village.trouverHabitant(30);
		 * Le message de levèe apparait suite à un appel de la fonction triouverhabitant qui essaye de trouver les 30émé élément non existant
		 * 
		*/
		Chef Abraracourcix = new Chef("Abraracourcix", 6, village);
		Gaulois Asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(Asterix);
		/*Gaulois gaulois = village.trouverHabitant(0)
		 * Gaulois gaulois = village.trouverHabitant(1)
		 * Le premier indice du tableau est 0 et non 1 donc l'appel de la methode trouverHabitant(1) essaye un élément non existant
		 * 
		 */
		Gaulois Obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(Obelix);
		village.afficherVillageois();
		
		
	}
}