package launchers;
import tp.model.agents.*;
import tp.model.decors.*;
import tp.model.comportements.*;

import java.awt.Point;

public class LauncherTP2 {
	
	public static void main(String [] args) {
		Animal a = new Animal(Sexe.Femelle,new Point(25,30));
		AbeilleSolitaire b = new AbeilleSolitaire(Sexe.Femelle,new Point(40,35));
		Arbre c = new Arbre(new Point(10,85));
		FrelonAsiatique d = new FrelonAsiatique(Sexe.Male,new Point(12,47));
		Varroa e = new Varroa();
		Ruche f = new Ruche(new Point (15,33));
		AbeilleDomestique g = new AbeilleDomestique(Sexe.Femelle,new Point(4,5));
		
		
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
		System.out.println(f.peutAccueillir(g));
		System.out.println(g.getHebergeur());
		
		System.out.println(b.getMiel());
		b.setMiel(500000);
		System.out.println(b.getMiel());
		
		//a.seDeplacer();
		//System.out.println(a);
	}
}