package histoire;



import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {
	
	public static void main(String[] args) {
		Druide Panoramix = new Druide("Panoramix", 5, 6);
		Gaulois Obélix = new Gaulois("Obélix", 8);
		Gaulois Asterix = new Gaulois("Asterix", 8);
		Romain Minus = new Romain("Minus", 8);
		Panoramix.parler("Je vais aller préparer une petite potion...");
		Panoramix.preparerPotion();
		Panoramix.booster(Obélix);
		Obélix.parler("Par Bélénos, ce n'est pas juste !");
		Panoramix.booster(Asterix);
		Asterix.parler("Bonjour");
		Asterix.frapper(Minus);
		
		
		
	}

}
