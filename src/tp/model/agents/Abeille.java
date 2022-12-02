/**
 * 
 */
package tp.model.agents;

import java.awt.Point;

import tp.model.comportements.Hebergeur;
/**
 * @author evann.nalewajek
 *
 */
public class Abeille extends Animal implements Hebergeur{
	/**
	 * 
	 */
	
	private int miel = 0;
	
	public boolean peutAccueillir(Animal a) {
		if (a instanceof Varroa) {
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
	
	public Abeille(Sexe sexe, Point coord) {
		// TODO Auto-generated constructor stub
		super(sexe,coord);
	}

	public Abeille() {
		super();
	}
	
	public Abeille(Sexe sexe) {
		super(sexe);
	}
	
	public int getMiel() {
		return this.miel;
	}
	
	public void setMiel(int a) {
		this.miel += a;
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
