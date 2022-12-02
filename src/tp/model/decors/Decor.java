package tp.model.decors;

import java.awt.Point;

// import tp.model.comportements.Hebergeur;

public class Decor {
	private static int currentId = 0;
	protected int id;
	protected Point coord;
	
	protected static int getUniqueId() {
		//TODO
		currentId ++;
		return currentId;
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + " " + this.id + ", (" + this.coord.x + ", " + this.coord.y +").";
	}
	
	public Decor() {
		this.coord=new Point(0,0);
		this.id = getUniqueId();
	}
	
	public Decor(Point coord) {
		this.coord=new Point(coord);
		this.id = getUniqueId();
	}
}