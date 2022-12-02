/**
 * 
 */
package tp.model.agents;

import java.awt.Point;

/**
 * @author evann.nalewajek
 *
 */
public class AbeilleDomestique extends Abeille{

	/**
	 * 
	 */
	public AbeilleDomestique(Sexe sexe, Point coord) {
		super(sexe,coord);
	}

	public AbeilleDomestique() {
		super();
	}
	
	public AbeilleDomestique(Sexe sexe) {
		super(sexe);
	}

}
