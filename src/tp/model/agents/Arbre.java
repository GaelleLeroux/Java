/**
 * 
 */
package tp.model.agents;

import tp.model.comportements.Hebergeur;

import java.awt.Point;

/**
 * @author evann.nalewajek
 *
 */
public class Arbre extends Vegetal implements Hebergeur{
	/**
	 * 
	 */
	public boolean peutAccueillir(Animal a) {
		if ((a instanceof Frelon)||(a instanceof AbeilleSolitaire)) {
			a.setHebergeur(this);
			return true;
		}
		else {
			return false;
		}
	};
	
	public boolean accueillir(Animal a) {
		if (peutAccueillir(a)) {
			return true;
		}
		else {
			return false;
		}
	};
	
	public Arbre() {
		super();
	}
	
	public Arbre(Point coord) {
		super(coord);
	}

	@Override
	public boolean peutAccueillir(Agent a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean accueillir(Agent a) {
		// TODO Auto-generated method stub
		return false;
	}
}
