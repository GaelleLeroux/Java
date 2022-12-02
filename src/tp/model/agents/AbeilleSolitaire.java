/**
 * 
 */
package tp.model.agents;

import java.awt.Point;

/**
 * @author evann.nalewajek
 *
 */
public class AbeilleSolitaire extends Abeille{

	/**
	 * 
	 */
	public AbeilleSolitaire(Sexe sexe, Point coord) {
		super(sexe,coord);
	}

	public AbeilleSolitaire() {
		super();
	}
	
	public AbeilleSolitaire(Sexe sexe) {
		super(sexe);
	}
}