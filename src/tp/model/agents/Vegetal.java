/**
 * 
 */
package tp.model.agents;

import java.awt.Point;

/**
 * @author evann.nalewajek
 *
 */
public class Vegetal extends Agent{

	/**
	 * 
	 */
	public Vegetal() {
		// TODO Auto-generated constructor stub
		/* crée un végétal sans sexe, à la position (0;0), d'âge 0 et lui attribue un id unique
		 */
		age = 0;
		this.sexe = sexe.Assexue;
		this.coord=new Point(0,0);
		id = Animal.getUniqueId();
	}
	
	public Vegetal(Point coord) {
		// TODO Auto-generated constructor stub
		/* crée un végétal sans sexe, à la position (0;0), d'âge 0 et lui attribue un id unique
		 */
		age = 0;
		this.sexe = sexe.Assexue;
		this.coord=new Point(coord);
		id = Animal.getUniqueId();
	}
}
