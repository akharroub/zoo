package fr.akharroub.zoo;

import fr.akharrorb.zoo.animalnageur.Dauphin;
import fr.akharrorb.zoo.animalsautent.Chat;
import fr.akharrorb.zoo.animalsautent.Chian;
import fr.akharrorb.zoo.animalsautent.cheval;
import fr.akharroub.zoo.animal.Elephant;
import fr.akharroub.zoo.animalvolant.Aigle;

public class Main {

	public static void main(String[] args) {

		Chian rex = new Chian("Rex", "Berger", 15, 12, "Jaune", true);

		System.out.println(rex.getRace());

		Chat tom = new Chat("Tom", "Birman", 8, 6, "Rouge", true);
		System.out.println(tom.getNom());

		cheval ch = new cheval("Cheval", "Cheval de course", 100, 20, "Gris", false);

		System.out.println(ch.getNom());

		ch.manger();

		ch.sauter();

		Elephant petitElephant = new Elephant("Eleph", "Race des elephants", 1000, 120, "Gris", false);
		System.out.println("Animal: " + petitElephant.getNom());
		petitElephant.courir();
		System.out.println("TOM:");
		tom.sauter();

		Aigle fofo = new Aigle("fofo", "afric", 10, 15, "noire", true);
		System.out.println(fofo.getNom());
		fofo.voler();

		Dauphin sky = new Dauphin("sky", "happy", 50, 4, "bleu", false);
		System.out.println(sky.getCouleur());
		sky.nageur();
	}

}
