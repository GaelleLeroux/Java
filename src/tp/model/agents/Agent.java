package tp.model.agents;

import java.awt.Point;

public class Agent {

	private static int currentId = 0;
	/** identifiant unique de l'animal*/
	protected int id;
	/** age en unité de temps*/
	protected int age;
	/** position sur la carte*/
	protected Point coord;
	protected Sexe sexe;

	/**
	 * Renvoie un identifiant unique non encore utilisé
	 * @return un identifiant entier unique d'animal
	 */
	protected static int getUniqueId() {
		//TODO
		currentId ++;
		return currentId;
	}

	/**
	 * retourne l'âge
	 * @return
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * retourne l'ID
	 * @return
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * retourne les coords
	 * @return
	 */
	public Point getCoord() {
		return new Point(this.coord.x, this.coord.y);
	}

	/**
	 * Met à jour l'age si il veillit
	 * @param new_age
	 */
	public void setAge(int new_age) {
		if (new_age>age) {
			age = new_age;
		}
	}

	public void setCoord(int dx, int dy) {
		coord.x = coord.x + dx;
		coord.y = coord.y + dy;
	}

	public void vieillir() {
		//TODO fait vieillir l'animal d'une unité de temps
		//une bonne manière de faire, une moins bonne...
		setAge(getAge()+1);
	}
	
	/**
	 * retourne le sexe
	 * @return
	 */
	public Sexe getSexe() {
		return this.sexe; 
	}

	public String toString() {
		return this.getClass().getSimpleName() + " " + this.id + " (" + this.sexe + ", (" + this.coord.x + ", " + this.coord.y +")).";
	}
	/*
	 * Redéfinitions de méthodes d'object
	 */
	//TODO

	public Agent() {
		super();
	}

}