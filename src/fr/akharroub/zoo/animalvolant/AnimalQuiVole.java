package fr.akharroub.zoo.animalvolant;

import fr.akharrorb.zoo.animalsautent.AnimalQuiPeutSaute;

public class AnimalQuiVole extends AnimalQuiPeutSaute {
	protected int longueurAile;

	/**
	 * 
	 */
	public AnimalQuiVole() {
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
	public AnimalQuiVole(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
		// TODO Auto-generated constructor stub
	}

	public void voler() {
		System.out.println("Je peux voler!!");
	}

	/**
	 * @return the longueurAile
	 */
	public int getLongueurAile() {
		return longueurAile;
	}

	/**
	 * @param longueurAile the longueurAile to set
	 */
	public void setLongueurAile(int longueurAile) {
		this.longueurAile = longueurAile;
	}

}
