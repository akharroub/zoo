package fr.akharrorb.zoo.animalnageur;

import fr.akharroub.zoo.animalvolant.AnimalQuiVole;

public class AnimalQuiNageu extends AnimalQuiVole {

	/**
	 * 
	 */
	public AnimalQuiNageu() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param race
	 * @param poids
	 * @param age
	 * @param couleur
	 * @param griffes
	 */
	public AnimalQuiNageu(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
		// TODO Auto-generated constructor stub
	}

	public void nageur() {
		System.out.println("je nageu !!");
	}

}
