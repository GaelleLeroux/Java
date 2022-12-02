/**
 * 
 */
package tp.model.agents;

import java.awt.Point;

/**
 * @author evann.nalewajek
 *
 */
public class Varroa extends Animal{

	/**
	 * 
	 */
	public Varroa(Sexe sexe, Point coord) {
		super(sexe,coord);
	}
	
	public Varroa() {
		super();
	}
	
	public Varroa(Sexe sexe) {
		super(sexe);
	}

}
