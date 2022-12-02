package launchers;
import tp.model.agents.*;
import tp.model.comportements.*;

import java.awt.Point;

public class LauncherTP2 {
	
	public static void main(String [] args) {
		Animal a = new Animal(Sexe.Femelle,new Point(25,30));
		AbeilleSolitaire b = new AbeilleSolitaire(Sexe.Femelle,new Point(40,35));
		Arbre c = new Arbre(new Point(10,85));
		FrelonAsiatique d = new FrelonAsiatique(Sexe.Male,new Point(12,47));
		Varroa e = new Varroa();
		
		
		//TODO
		//tester la hiérarchie d'agent
		System.out.println(a);
		System.out.println("\n");
		System.out.println(b);
		System.out.println("\n");
		System.out.println(c);
		System.out.println("\n");
		System.out.println(c.peutAccueillir(b));
		System.out.println(b.getHebergeur());
		System.out.println("\n");
		System.out.println(c.peutAccueillir(a));
		System.out.println(a.getHebergeur());
		System.out.println("\n");
		System.out.println(c.peutAccueillir(d));
		System.out.println(d.getHebergeur());
		System.out.println("\n");
		System.out.println(c.peutAccueillir(e));
		System.out.println(e.getHebergeur());
		System.out.println("\n");
		
		System.out.println(b.getMiel());
		b.setMiel(500000);
		System.out.println(b.getMiel());
		
		//a.seDeplacer();
		//System.out.println(a);
	}
}