package tp.model.agents;

import java.awt.Point;

import tp.model.comportements.Hebergeur;
/**
 * Cette classe modélise un Animal dans la simulation
 * @author Evann / Gaelle
 *
 */
public class Animal extends Agent {
	/** état de santé de l'animal */
	private Etat etat;
	private Hebergeur hebergeur;
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((etat == null) ? 0 : etat.hashCode());
		result = prime * result + ((sexe == null) ? 0 : sexe.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (etat != other.etat)
			return false;
		if (sexe != other.sexe)
			return false;
		return true;
	}



	/* 
	 * constructeurs 
	 */
	/**
	 * 
	 * @param sexe
	 * @param coord
	 */
	public Animal(Sexe sexe, Point coord) {
		age = 0;
		id = Animal.getUniqueId();
		this.sexe=sexe;
		this.coord=new Point(coord);
		this.etat = Etat.Normal;
	}
	
	public Animal(Sexe sexe) {
		//TODO
		/* crée un animal avec le sexe passé en paramètre, à la position (0;0), d'âge 0 et lui attribue un id unique
		 * une bonne manière de faire 
		 * en utilisant ce qui existe déjà, une moins bonne
		 */
		age = 0;
		this.sexe = sexe;
		this.etat = Etat.Normal;
		this.coord=new Point(0,0);
		id = Animal.getUniqueId();
	}
	
	public Animal() {
		//TODO
		/* crée un animal de sexe femelle, à la position (0;0), d'âge 0 et lui attribue un id unique
		 * une bonne manière de faire 
		 * en utilisant ce qui existe déjà, une moins bonne
		 */
		age = 0;
		this.sexe = sexe.Femelle;
		this.coord=new Point(0,0);
		id = Animal.getUniqueId();
		this.etat = Etat.Normal;
	}
	
	/**
	 * retourne l'état
	 * @return
	 */
	public Etat getEtat() {
		return this.etat;
	}
	
	public Hebergeur getHebergeur() {
		return this.hebergeur;
	}
	
	public void setHebergeur(Hebergeur a) {
		this.hebergeur = a;
	}
	

	/* 
	 * comportements d'instance
	 */
	
	
	/**
	 * Fonction seDeplacer() permet de déplacer aléatoirement l'animal de -1, 0 ou 1, de x ou y
	 */
	public void seDeplacer() {
		double dx;
		double dy;
		dx = Math.floor(Math.random()*3-1);
		dy = Math.floor(Math.random()*3-1);
		int dx_int = (int)dx;
		int dy_int = (int)dy;
		setCoord(dx_int,dy_int);
	}
	
	public void rencontrer(Agent a) {
		//TODO
	}

	/* comportements de classe */
	
	public static void main(String args[]) {
		//tests unitaires de la classe Animal
		//TODO décommentez les lignes pour approfondir le test unitaire
		//complétez la méthode pour tester les nouvelles fonctionnalités que vous allez implémenter
		Animal a = new Animal();
		Agent b = new Animal(Sexe.Male);
		Agent c = new Animal(Sexe.Assexue);
		Animal d = new Animal(Sexe.Femelle,new Point(25,30));
		Agent e = new Animal(Sexe.Femelle,new Point(25,30));
		
		/*
		 * les lignes suivantes doivent afficher à terme: NomDeLaClasse n° id_animal(sexe, (position x; position y)).
		 * ex: 28 (FEMELLE, (25;30))
		 */
		System.out.println("*** Animaux créés: **********");
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("*** Getters et setters **********");
		
		System.out.println("\n-> GetSexe pour l'animal D");
		System.out.println(d.getSexe());
		Sexe ss = d.getSexe();
		ss = Sexe.Male;
		System.out.println(d.getSexe());
		
		//les lignes suivantes devraient afficher la même chose...
		
		System.out.println("\n-> GetCoord pour l'animal D");
		System.out.println(d.getCoord());
		Point pt = d.getCoord();
		pt.x = 50;
		System.out.println(d.getCoord());
		
		
		//TODO ajoutez vos propres tests de getters et setters
		
		System.out.println("\n-> GetID pour l'animal D");
		System.out.println(d.getId());
		int idd = d.getId();
		idd = 7145864;
		System.out.println(d.getId());
		
		System.out.println("\n-> GetEtat pour l'animal D");
		System.out.println(d.getEtat());
		Etat eta = d.getEtat();
		eta = Etat.PleineForme;
		System.out.println(d.getEtat());
		
		System.out.println("\n-> GetAge pour l'animal A");
		System.out.println(a.getAge());
		
		System.out.println("\n-> Test du setAge à 1");
		a.setAge(1);
		System.out.println(a.getAge());
		int ag = a.getAge();
		ag = 54;
		System.out.println(a.getAge());
		
		
		//TODO test vieillir
		System.out.println("\n-> Test du vieillissement pour B");
		System.out.println(b.getAge());
		b.vieillir();
		System.out.println(b.getAge());
		
		//TODO test seDeplacer
		a.seDeplacer();
		
		//TODO test id
		System.out.println("\n-> All ID");
		System.out.println(a.getId());
		System.out.println(b.getId());
		System.out.println(c.getId());
		System.out.println(d.getId());
		System.out.println(e.getId());
		
		
		// Test 4211
		System.out.println("\n-> String toString");
		System.out.println(a);
		
		/*
		 * Test comparaison
		 */
		System.out.println("\n-> Test Comparaison");
		System.out.println(d==e);
		System.out.println(d.equals(e));
		System.out.println("Bonjour"=="Bonjour");
		System.out.println("Bonjour".equals("Bonjour"));
		

	}

}
