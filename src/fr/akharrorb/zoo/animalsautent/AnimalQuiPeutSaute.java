package fr.akharrorb.zoo.animalsautent;

import fr.akharroub.zoo.animal.Animal;

public class AnimalQuiPeutSaute extends Animal {

	/**
	 * 
	 */
	public AnimalQuiPeutSaute() {
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
	public AnimalQuiPeutSaute(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
		// TODO Auto-generated constructor stub
	}

	public void sauter() {
		System.out.println("Je peux sauter!!");
	}

}
