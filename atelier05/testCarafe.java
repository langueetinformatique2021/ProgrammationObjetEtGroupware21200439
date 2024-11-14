package atelier05;

public class testCarafe {
	public static void main(String[] args) {
		// Création de deux objets Carafe : c1 avec une capacité de 5 litres et c2 avec une capacité de 7 litres
		Carafe c1 = new Carafe(5);
		Carafe c2 = new Carafe(7);
		
		// Affichage de la capacité des deux carafes
		System.out.println("Capacité de la carafe 1 : " + c1.capacite());
		System.out.println("Capacité de la carafe 2 : " + c2.capacite());
		
		// Affichage du contenu actuel des deux carafes (initialisé à 0)
		System.out.println("Contenu de la carafe 1 : " + c1.contenu());
		System.out.println("Contenu de la carafe 2 : " + c2.contenu());
	}
}
