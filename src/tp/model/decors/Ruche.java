/**
 * 
 */
package tp.model.decors;

import tp.model.agents.AbeilleDomestique;
import tp.model.agents.Agent;
import tp.model.agents.Animal;
import tp.model.comportements.Hebergeur;

import java.awt.Point;
/**
 * @author evann.nalewajek
 *
 */
public class Ruche extends Decor implements Hebergeur{
	private int miel = 0;
	/**
	 * 
	 */
	public Ruche() {
		super();
	}
	
	public Ruche(Point coord) {
		super(coord);
	}
	
	public int getMiel() {
		return this.miel;
	}
	
	public void setMiel(int a) {
		this.miel += a;
	}
	
	public boolean peutAccueillir(Animal a) {
		if (a instanceof AbeilleDomestique) {
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
